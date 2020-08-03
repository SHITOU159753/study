package Spring2.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class ClhTypeFilters implements TypeFilter {
    private ClassMetadata classMetadata;

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        classMetadata = metadataReader.getClassMetadata();

        Resource resource =  metadataReader.getResource();

        String className = classMetadata.getClassName();

        if(className.contains("o")){
            return true;
        }

        return false;
    }

}
