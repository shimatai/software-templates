FROM openjdk:17-alpine
ENTRYPOINT ["/usr/bin/${{values.component_id}}.sh"]

COPY ${{values.component_id}}.sh /usr/bin/${{values.component_id}}.sh
COPY target/${{values.component_id}}.jar /usr/share/${{values.component_id}}/${{values.component_id}}.jar
