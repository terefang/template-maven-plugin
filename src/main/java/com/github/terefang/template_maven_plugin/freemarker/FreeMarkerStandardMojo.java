package com.github.terefang.template_maven_plugin.freemarker;

import com.github.terefang.template_maven_plugin.AbstractStandardMojo;
import com.github.terefang.template_maven_plugin.TemplateContext;
import lombok.SneakyThrows;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "freemarker-standard", defaultPhase = LifecyclePhase.GENERATE_RESOURCES)
public class FreeMarkerStandardMojo extends AbstractStandardMojo {

    private static final String[] DEFAULT_INCLUDES = new String[]{"**/*.fm"};

    public String[] getDefaultIncludes()
    {
        return DEFAULT_INCLUDES;
    }

    @Override
    @SneakyThrows
    public String process(TemplateContext _context)
    {
        return FreeMarkerUtil.process(_context, this.outputType);
    }
}
