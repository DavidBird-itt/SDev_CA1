
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
        
       

        <p>
            <a href=""""),_display_(/*39.23*/routes/*39.29*/.HomeController.addEmployee()),format.raw/*39.58*/("""">
                <button class="btn btn-primary">Add an Employee</button>
            </a>
        </p>


        <p>
            <a href=""""),_display_(/*46.23*/routes/*46.29*/.HomeController.updateEmployee(i.getId)),format.raw/*46.68*/("""">
                <button class="btn btn-primary">Update an Employee</button>
            </a>
        </p>
    """)))}),format.raw/*50.6*/("""
    """),format.raw/*51.5*/("""</tbody>
 
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
        
        """),_display_(/*68.10*/for(i<-plist) yield /*68.23*/ {_display_(Seq[Any](format.raw/*68.25*/(""" 
            """),format.raw/*69.13*/("""<tr>
                <td>"""),_display_(/*70.22*/i/*70.23*/.getId),format.raw/*70.29*/("""</td>
                <td>"""),_display_(/*71.22*/i/*71.23*/.getName),format.raw/*71.31*/("""</td>
                <td>"""),_display_(/*72.22*/i/*72.23*/.getStartDate),format.raw/*72.36*/("""</td>
                <td>"""),_display_(/*73.22*/i/*73.23*/.getNumMembers),format.raw/*73.37*/("""</td>
            </tr>
        """)))}),format.raw/*75.10*/("""
       
    
"""),format.raw/*78.1*/("""<!-- Button to add a new project -->
    <p>
        <a href=""""),_display_(/*80.19*/routes/*80.25*/.HomeController.addProject()),format.raw/*80.53*/("""">
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
        
        """),_display_(/*104.10*/for(i<-alist) yield /*104.23*/ {_display_(Seq[Any](format.raw/*104.25*/(""" 
            """),format.raw/*105.13*/("""<tr>
                <td>"""),_display_(/*106.22*/i/*106.23*/.getEircode),format.raw/*106.34*/("""</td>
                <td>"""),_display_(/*107.22*/i/*107.23*/.getStreet1),format.raw/*107.34*/("""</td>
                <td>"""),_display_(/*108.22*/i/*108.23*/.getTown),format.raw/*108.31*/("""</td>
                <td>"""),_display_(/*109.22*/i/*109.23*/.getCounty),format.raw/*109.33*/("""</td>
            </tr>
        """)))}),format.raw/*111.10*/("""
       
    """),format.raw/*113.5*/("""</tbody>
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
                  DATE: Wed Mar 13 14:29:38 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: df475cef9b7787642572d8231e886edff1052f33
                  MATRIX: 1042->1|1266->133|1296->155|1335->157|1368->186|1399->192|1439->224|1478->226|1513->235|1587->283|1600->288|1635->303|1670->312|1712->324|1740->325|2176->734|2205->747|2245->749|2287->763|2340->789|2350->790|2377->796|2431->823|2441->824|2470->832|2524->859|2534->860|2564->869|2618->896|2628->897|2658->906|2719->940|2768->968|2871->1044|2886->1050|2936->1079|3105->1221|3120->1227|3180->1266|3324->1380|3356->1385|3785->1787|3814->1800|3854->1802|3896->1816|3949->1842|3959->1843|3986->1849|4040->1876|4050->1877|4079->1885|4133->1912|4143->1913|4177->1926|4231->1953|4241->1954|4276->1968|4340->2001|4381->2015|4471->2078|4486->2084|4535->2112|5162->2711|5192->2724|5233->2726|5276->2740|5330->2766|5341->2767|5374->2778|5429->2805|5440->2806|5473->2817|5528->2844|5539->2845|5569->2853|5624->2880|5635->2881|5667->2891|5732->2924|5773->2937
                  LINES: 28->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|42->11|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|70->39|70->39|70->39|77->46|77->46|77->46|81->50|82->51|99->68|99->68|99->68|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|106->75|109->78|111->80|111->80|111->80|135->104|135->104|135->104|136->105|137->106|137->106|137->106|138->107|138->107|138->107|139->108|139->108|139->108|140->109|140->109|140->109|142->111|144->113
                  -- GENERATED --
              */
          