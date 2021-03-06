package de.agilecoders.wicket.extensions.markup.html.bootstrap.markdown;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryPluginResourceReference;

public class MarkdownJsResourceReference extends JQueryPluginResourceReference {

    public MarkdownJsResourceReference() {
        super(MarkdownJsResourceReference.class, "res/js/bootstrap-markdown.js");
    }

    @Override
    public Iterable<? extends HeaderItem> getDependencies() {
        List<HeaderItem> dependencies = new ArrayList<HeaderItem>();
        dependencies.add(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(MarkdownJsResourceReference.class, "res/js/markdown.js")));
        dependencies.add(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(MarkdownJsResourceReference.class, "res/js/to-markdown.js")));
        return dependencies;
    }
}
