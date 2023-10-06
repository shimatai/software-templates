package ${{values.java_package_name}}.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class File {

    protected String fileName;

    protected String directoryPath;

    protected LocalDateTime createdAt;

    protected LocalDateTime changedAt;
}
