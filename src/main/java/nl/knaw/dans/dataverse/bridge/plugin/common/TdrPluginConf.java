package nl.knaw.dans.dataverse.bridge.plugin.common;

import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TdrConf
 * Created by Eko Indarto
 */

public class TdrPluginConf {
    private String tdrName;
    private String actionClassName;
    private URLClassLoader actionClassLoader;
    private List<XslStreamSource> xsl;

    public TdrPluginConf() {
    }

    public TdrPluginConf(String tdrName, String actionClassName, URLClassLoader actionClassLoader, List<XslStreamSource> xsl) {
        this.tdrName = tdrName;
        this.actionClassName = actionClassName;
        this.actionClassLoader = actionClassLoader;
        this.xsl = xsl;
    }

    public String getTdrName() {
        return tdrName;
    }

    public void setTdrName(String tdrName) {
        this.tdrName = tdrName;
    }

    public TdrPluginConf actionClassName(String actionClassName) {
        this.actionClassName = actionClassName;
        return this;
    }

    public URLClassLoader getActionClassLoader() {
        return actionClassLoader;
    }

    public void setActionClassLoader(URLClassLoader actionClassLoader) {
        this.actionClassLoader = actionClassLoader;
    }

    public String getActionClassName() {
        return actionClassName;
    }

    public void setActionClassName(String actionClassName) {
        this.actionClassName = actionClassName;
    }


    @Override
    public int hashCode() {
        return Objects.hash(tdrName, actionClassName, xsl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TdrConf {\n");
        sb.append("    tdrName: ").append(toIndentedString(tdrName)).append("\n");
        sb.append("    actionClassName: ").append(toIndentedString(actionClassName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public List<XslStreamSource> getXsl() {
        return xsl;
    }

    public void setXsl(List<XslStreamSource> xsl) {
        this.xsl = xsl;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

