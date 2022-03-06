package io.github.p03w;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class LoomFailurePlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        target.getTasks().whenTaskAdded(task -> {});
    }
}
