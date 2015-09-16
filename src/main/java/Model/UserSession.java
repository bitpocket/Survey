/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author adrianrobak
 */
public class UserSession {
    public String SurveyId;
    public int UserId;
    public int Rate;
    public ArrayList<String> SummaryDecriptionRate = new ArrayList<>();
    public Date DateOfFinish;

   
}
