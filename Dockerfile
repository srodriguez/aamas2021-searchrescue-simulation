FROM openjdk:8
COPY ./target/hat-airsim-search-rescue-*-jar-with-dependencies.jar /scenario/agents.jar
WORKDIR /scenario
ENTRYPOINT ["java","-jar", "agents.jar", "hat.airsim.BootAgent"]