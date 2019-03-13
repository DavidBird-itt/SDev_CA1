
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object databaseTest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employees],List[models.Project],List[models.Address],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elist: List[models.users.Employees], plist: List[models.Project], 
    alist: List[models.Address], emps: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Database", emps)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

    """),format.raw/*5.28*/("""
    """),_display_(/*6.6*/if(flash.containsKey("success"))/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
        """),format.raw/*7.9*/("""<div class="alert- alert-success">
            """),_display_(/*8.14*/flash/*8.19*/.get("success")),format.raw/*8.34*/("""
        """),format.raw/*9.9*/("""</div>
    """)))}),format.raw/*10.6*/("""
"""),format.raw/*11.1*/("""<table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Employee Table</h2>
        <tr>
            <th>ID</th>
            <th>Type</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Salary</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->
        
        """),_display_(/*27.10*/for(i<-elist) yield /*27.23*/ {_display_(Seq[Any](format.raw/*27.25*/(""" 
            """),format.raw/*28.13*/("""<tr>
                <td>"""),_display_(/*29.22*/i/*29.23*/.getId),format.raw/*29.29*/("""</td>
                <td>"""),_display_(/*30.22*/i/*30.23*/.getType),format.raw/*30.31*/("""</td>
                <td>"""),_display_(/*31.22*/i/*31.23*/.getfName),format.raw/*31.32*/("""</td>
                <td>"""),_display_(/*32.22*/i/*32.23*/.getlName),format.raw/*32.32*/("""</td>
                <td>&euro; """),_display_(/*33.29*/("%.2f".format(i.getSalary))),format.raw/*33.57*/("""</td>
            </tr>
        """)))}),format.raw/*35.10*/("""
       

        """),format.raw/*38.9*/("""<p>
            <a href=""""),_display_(/*39.23*/routes/*39.29*/.HomeController.addEmployee()),format.raw/*39.58*/("""">
                <button class="btn btn-primary">Add an Employee</button>
            </a>
        </p>

    </tbody>
 
    <table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Project Table</h2>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Start Date</th>
            <th>Number of Members</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Project data  -->
        
        """),_display_(/*61.10*/for(i<-plist) yield /*61.23*/ {_display_(Seq[Any](format.raw/*61.25*/(""" 
            """),format.raw/*62.13*/("""<tr>
                <td>"""),_display_(/*63.22*/i/*63.23*/.getId),format.raw/*63.29*/("""</td>
                <td>"""),_display_(/*64.22*/i/*64.23*/.getName),format.raw/*64.31*/("""</td>
                <td>"""),_display_(/*65.22*/i/*65.23*/.getStartDate),format.raw/*65.36*/("""</td>
                <td>"""),_display_(/*66.22*/i/*66.23*/.getNumMembers),format.raw/*66.37*/("""</td>
            </tr>
        """)))}),format.raw/*68.10*/("""
       
    
"""),format.raw/*71.1*/("""<!-- Button to add a new project -->
    <p>
        <a href=""""),_display_(/*73.19*/routes/*73.25*/.HomeController.addProject()),format.raw/*73.53*/("""">
            <button class="btn btn-primary">Add a Project</button>
        </a>
    </p>

<!-- Button to update an existing project -->
<!-- this was added but was giving errors even when commented -->

</tbody>
    <table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Address Table</h2>
        <tr>
            <th>Eircode</th>
            <th>Street 1</th>
            <th>Town</th>
            <th>County</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->
        
        """),_display_(/*97.10*/for(i<-alist) yield /*97.23*/ {_display_(Seq[Any](format.raw/*97.25*/(""" 
            """),format.raw/*98.13*/("""<tr>
                <td>"""),_display_(/*99.22*/i/*99.23*/.getEircode),format.raw/*99.34*/("""</td>
                <td>"""),_display_(/*100.22*/i/*100.23*/.getStreet1),format.raw/*100.34*/("""</td>
                <td>"""),_display_(/*101.22*/i/*101.23*/.getTown),format.raw/*101.31*/("""</td>
                <td>"""),_display_(/*102.22*/i/*102.23*/.getCounty),format.raw/*102.33*/("""</td>
            </tr>
        """)))}),format.raw/*104.10*/("""
       
    """),format.raw/*106.5*/("""</tbody>
    """)))}))
      }
    }
  }

  def render(elist:List[models.users.Employees],plist:List[models.Project],alist:List[models.Address],emps:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(elist,plist,alist,emps)

  def f:((List[models.users.Employees],List[models.Project],List[models.Address],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (elist,plist,alist,emps) => apply(elist,plist,alist,emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 09:52:04 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: e4a0b4db80cd932f88ce37aaf39b262783177bae
                  MATRIX: 1042->1|1266->133|1296->155|1335->157|1368->186|1399->192|1439->224|1478->226|1513->235|1587->283|1600->288|1635->303|1670->312|1712->324|1740->325|2176->734|2205->747|2245->749|2287->763|2340->789|2350->790|2377->796|2431->823|2441->824|2470->832|2524->859|2534->860|2564->869|2618->896|2628->897|2658->906|2719->940|2768->968|2832->1001|2877->1019|2930->1045|2945->1051|2995->1080|3535->1593|3564->1606|3604->1608|3646->1622|3699->1648|3709->1649|3736->1655|3790->1682|3800->1683|3829->1691|3883->1718|3893->1719|3927->1732|3981->1759|3991->1760|4026->1774|4090->1807|4131->1821|4221->1884|4236->1890|4285->1918|4911->2517|4940->2530|4980->2532|5022->2546|5075->2572|5085->2573|5117->2584|5172->2611|5183->2612|5216->2623|5271->2650|5282->2651|5312->2659|5367->2686|5378->2687|5410->2697|5475->2730|5516->2743
                  LINES: 28->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|42->11|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|66->35|69->38|70->39|70->39|70->39|92->61|92->61|92->61|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|99->68|102->71|104->73|104->73|104->73|128->97|128->97|128->97|129->98|130->99|130->99|130->99|131->100|131->100|131->100|132->101|132->101|132->101|133->102|133->102|133->102|135->104|137->106
                  -- GENERATED --
              */
          