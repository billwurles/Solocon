package com.burles.solocon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrameController {
    String codegena = "<div class=\"codegena_iframe\">" +
            "<iframe src=\"https://breakingpoint.local:8081\" height=\"100%\" width=\"100%\"  " +
            "style=\"border:0px;\"></iframe></div><style>.codegena_iframe{position:relative;padding-bottom:56.25%;height:0;overflow: hidden;max-width:100%;}.codegena_iframe iframe{position:absolute;top:0;left:0;width:100%;height:100%;}</style>";
    String iframe = "<iframe sandbox='allow-forms allow-same-origin allow-pointer-lock allow-scripts allow-popups allow-modals allow-top-navigation'\n" +
            "\t\tallowfullscreen='true' webkitallowfullscreen='true' mozallowfullscreen='true' scrolling='auto' data-title='\" . $section[\"name\"] . \"' \".($default ? 'src' : 'data-src').\"='\" . $url . \"'></iframe>\n";
    String vampireneo = "<iframe src=\"http://breakingpoint.local:8081\" frameborder=\"0\" style=\"overflow:hidden;overflow-x:hidden;overflow-y:hidden;height:100%;width:100%;position:absolute;top:0px;left:0px;right:0px;bottom:0px\" height=\"100%\" width=\"100%\"></iframe>";
    String style = "width: 100%;\n" +
            "\theight: 926px;\n" +
            "\tborder: 0;\n" +
            "\tpadding: 0;\n" +
            "\tmargin: 0;\n" +
            "\tmargin-top: 0px;\n" +
            "\tfilter: none;\n" +
            "\t-webkit-filter: blur(0px);\n" +
            "\t-moz-filter': blur(0px);\n" +
            " -ms-filter: blur(0px);\n" +
            "\t-o-filter: blur(0px);\n" +
            "\tfilter: progid: DXImageTransform.Microsoft.Blur(PixelRadius='0');\n" +
            "\t-webkit-transform: translate3d(0, 0, 0);\n" +
            "\t-webkit-perspective: 1000;\n" +
            "\t-ms-transform-origin: 0 0;\n" +
            "\t-moz-transform-origin: 0 0;\n" +
            "\t-o-transform-origin: 0 0;\n" +
            "\t-webkit-transform-origin: 0 0;\n" +
            "\ttransform-origin: 0 0;";
    String options = "sandbox='allow-forms allow-same-origin allow-pointer-lock allow-scripts allow-popups allow-modals allow-top-navigation'\n" +
            "\t\tallowfullscreen='true' webkitallowfullscreen='true' mozallowfullscreen='true' scrolling='auto'";

    @RequestMapping("/frame")
    public String displayIFrame() {
        return "<html><body>" +
                vampireneo +
                //"<iframe src=\"http://breakingpoint.local:8081\" "+options+" style=\""+style+"\" frameborder=\"0\""+
                "</body></html>";
    }
}
