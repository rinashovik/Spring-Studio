package org.launchcode.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillTrackController {

    @GetMapping
    @ResponseBody
    public String skillsInProgamming() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1> Skills Tracker</h1>" +
                        "<h2>Programming Languages</h2>" +
                       " <ol>"+
                        "<li>Java</li>"+
                        "<li>Python</li>"+
                        "<li>JavaScript</li>"+

                        " </ol>"+

                        "</body>" +
                        "</html>";
        return html;
    }

    @RequestMapping (value = "/form", method = {RequestMethod.GET, RequestMethod.POST})

    @ResponseBody
    public String sendingForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +

                        "<div>"+
                        "<label> Name<input type = 'text' name = 'name' /></label>" +
                        "</div>"+
                        "<div>"+

                        "<label> My Favorite Language:<br></label>" +

                     //  " <label for=\"language-select\">Choose a Language:</label>"+
                        "<select name='language'' id='language-select'>"+

                        "<option value='java'>Java</option>"+

                        "<option value='phython'>Phython</option>"+
                        "<option value='javaScripts'>JavaScripts</option>"+
                        "</select>"+"\n"+
                        "</div>"+

                        "<div>"+

                        "<label> My Favorite Language:<br></label>" +

                       // " <label for=\"language-select\">Choose a Language:</label>"+
                        "<select name='language'' id='language-select'>"+

                        "<option value='java'>Java</option>"+

                        "<option value='phython'>Phython</option>"+
                        "<option value='javaScripts'>JavaScripts</option>"+
                        "</select>"+"\n"+
                        "</div>"+
                        "<div>"+

                        "<label> My Favorite Language:<br></label>" +

                       // " <label for=\"language-select\">Choose a Language:</label>"+
                        "<select name='language'' id='language-select'>"+

                        "<option value='java'>Java</option>"+

                        "<option value='phython'>Phython</option>"+
                        "<option value='javaScripts'>JavaScripts</option>"+
                        "</select>"+"\n"+

                        "</div>"+



//                        "<label> My Favorite Language<input type = 'text' name = 'name' /></label>" +
//
//
//                       // "<select name='language'' id='language-select'>"+
//         "<option value=>--Please choose an option--</option>"+
//                       // "<label> Name<input type = 'text' name = 'name' /></label>" +
//         "<option value='java'>Java</option>"+
//
//                        "<option value='phython'>Phython</option>"+
//                        "<option value='javaScripts'>JavaScripts</option>"+
//
//
//                        "<option value='java'>Java</option>"+
//
//                        "<option value='phython'>Phython</option>"+
//                        "<option value='javaScripts'>JavaScripts</option>"+

                       "</select>"+"\n"+
                        "<input type = 'submit' value = 'Submit' />" +"\n"+
                        "</form>" +


                        "</body>" +
                        "</html>";
        return html;
    }




    }




