package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private String id;
    private String name;
    private Integer size;
    private String path;
    private String type;
}
