package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller


public class MathController {

    @RequestMapping("/add/{number1}/and/{number2}")
//  A diff approach (path="") is important if it is a POST-method!! GET is the default.
//    @RequestMapping(path = "/add/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable int number1, @PathVariable int number2) {


        return number1 + " and " + number2 + " = " + (number1 + number2) + "!";
    }

    @RequestMapping(path = "/subtract/{number1}/from/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable int number1, @PathVariable int number2) {


        return number1 + " from " + number2 + " = " + (number1 - number2) + "!";
    }

    @RequestMapping(path = "/multiply/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int number1, @PathVariable int number2) {

        return number1 + " and " + number2 + " = " + (number1 * number2) + "!";
    }

    @RequestMapping(path = "/divide/{number1}/by/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable int number1, @PathVariable int number2) {


        return number1 + " by " + number2 + " = " + (number1 / number2) + "!";
    }
}
