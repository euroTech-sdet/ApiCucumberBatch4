package com.devEx.common;

import java.util.HashMap;
import java.util.Map;

public class DataForApi {


    public static Map<String,Object> registerUserBody(String email, String password, String name, String google, String facebook, String github){

        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("email",email);
        requestMap.put("password",password);
        requestMap.put("name",name);
        requestMap.put("google",google);
        requestMap.put("facebook",facebook);
        requestMap.put("github",github);

        return requestMap;
    }

    /*
    {
  "company": "string",
  "website": "string",
  "location": "string",
  "status": "string",
  "skills": "HTML,CSS,Javascript",
  "githubusername": "string",
  "youtube": "string",
  "twitter": "string",
  "facebook": "string",
  "linkedin": "string",
  "instagram": "string"
}
     */

    public static Map<String,Object> saveProfileBody(String company,String website,String location,String status,String skills,String githubUsername,String youtube,String twitter,String facebook,String linkedin,String instagram ){

        Map<String,Object> profileBody = new HashMap<>();
        profileBody.put("skills",skills);
        profileBody.put("status",status);
        profileBody.put("company",company);
        profileBody.put("website",website);
        profileBody.put("githubUserName",githubUsername);
        profileBody.put("youtube",youtube);
        profileBody.put("location",location);
        profileBody.put("linkedin",linkedin);
        profileBody.put("twitter",twitter);
        profileBody.put("facebook",facebook);
        profileBody.put("instagram",instagram);


        return profileBody;
    }
}
