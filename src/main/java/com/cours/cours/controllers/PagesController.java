package com.cours.cours.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagesController {

    /*
     * le GetMapping c'est lorsqu'on fait une requette get
     * cette methode reupere l'url ici /
     * cette methode devait retourner normalement
     * une vue du nom de Hello world un template
     * mais on ajouter ReponseBody pour qu'elle retourne
     * une reponse helloworld
     * on peut tester ça sur postman
     */
    // @GetMapping("/")
    // @ResponseBody
    // public String home() {
    // return "hello world";
    // }

    /*
     * lorsqu'on entre url / on sera
     * rediriger vers lage home.html
     * qui se trouve dans le repertoire pages
     */

    /*
     * on peut aussi mettre ça sur le premier parametre HttpServletRequest request
     * httpServletRequest
     */

    /*
     * required false param non requi
     */
    @GetMapping("/")
    public String home(@RequestParam(required = false, defaultValue = "World") String name, ModelMap map) {
        /*
         * http://localhost:8080/?name=matar
         * si on entre cette url
         */
        /*
         * on affiche ici la valeur
         */
        // System.out.println(httpServletRequest.getParameter("name"));

        /*
         * http://localhost:8080/
         * si on entre cette url
         * la variable name sera null
         */

        /*
         * lorsque le premier param est HttpServletRequest request
         */
        // String name = httpServletRequest.getParameter("name") != null
        // && !httpServletRequest.getParameter("name").isEmpty() ?
        // httpServletRequest.getParameter("name")
        // : "world";

        map.put("name", name);

        return "pages/home";

    }

}
