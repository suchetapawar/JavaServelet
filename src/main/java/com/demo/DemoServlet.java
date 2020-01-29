package com.demo;

import javax.enterprise.inject.New;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import sun.font.TrueTypeFont;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Payload load = new Payload();
        load.setFood(true);
        load.setEventDescription("Abc");
        Gson gson = new Gson();
        String outputString = gson.toJson(load);

        //temp code for testing
        response.setContentType("text/json");
        PrintWriter out = response.getWriter();
        out.println(outputString);
    }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Payload load = new Payload();

        load.setEventName(request.getParameter("EventName"));
        load.setHostOrganization(request.getParameter("HostOrganization"));
        load.setEventPlanningCompany(request.getParameter("EventPlanningCompany"));
        load.setStreetAddress(request.getParameter("StreetAddress"));
        load.setMailingAddress(request.getParameter("MailingAddress"));


        load.setEmailPreferred(request.getParameter("IsEmailYourPreferredContactMethodradiobutton").contentEquals("Yes"));

        //load.setPrimaryEventContact(request.getParameter("StreetAddress"));
        //load.setAlternateContact(request.getParameter("StreetAddress"));
        load.setOrganizationWebSite(request.getParameter("OrganizationWebSite"));

        //load.setLinkToWebSite(request.getParameter("EventLinktoWebsitecheckbox"));
        load.setEventLocation(request.getParameter("EventLocation"));

        //load.setSetupDatesTimes(request.getParameter("StreetAddress"));
        //load.setEventDatesTimes(request.getParameter("StreetAddress"));
        //load.setPeakDatesTimes(request.getParameter("StreetAddress"));
        //load.setTakedownDatesTimes(request.getParameter("StreetAddress"));
        //load.setAlcohol(request.getParameter("StreetAddress"));
        //load.setFireworks(request.getParameter("StreetAddress"));
        //load.setRoadways(request.getParameter("StreetAddress"));
        //load.setTentsStages(request.getParameter("StreetAddress"));
        //load.setChildren(request.getParameter("StreetAddress"));
        //load.setFood(request.getParameter("StreetAddress"));
        //load.setHeldLastYear(request.getParameter("StreetAddress"));
        load.setAnticipatedTotalAttendance(request.getParameter("AnticipatedTotalAttendance"));
        load.setAnticipatedPeakAttendance(request.getParameter("AnticipatedPeakAttendance"));
        //load.setObj_ActivityTypes(request.getParameter("StreetAddress"));
        load.setEventDescription(request.getParameter("EventDescription"));
        //load.setRegisteredNonProfit(request.getParameter("StreetAddress"));
        //load.setOnBehalfNonProfit(request.getParameter("StreetAddress"));
        load.setNonProfitID(request.getParameter("NonProfitID"));
        //load.setCannabis(request.getParameter("StreetAddress"));
        load.setLegalEntityName(request.getParameter("LegalEntityName"));
        load.setOperatingName(request.getParameter("OperatingName"));
        //load.setCharitableOrganization(request.getParameter("StreetAddress"));
        //load.setBusinessImprovementArea(request.getParameter("StreetAddress"));



        Gson gson = new Gson();
        String outputString = gson.toJson(load);

        //temp code for testing
        response.setContentType("text/json");
        PrintWriter out = response.getWriter();
        out.println(outputString);
    }
}
