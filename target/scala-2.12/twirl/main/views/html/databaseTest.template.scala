
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

                <td>
                    <a href=""""),_display_(/*36.31*/routes/*36.37*/.HomeController.updateEmployee(i.getId)),format.raw/*36.76*/("""" class="button-xs btn-danger">
                        <span class="glyphicon-pencil"></span>
                    </a>
                </td>

                <td>
                    <a href=""""),_display_(/*42.31*/routes/*42.37*/.HomeController.deleteEmployee(i.getId)),format.raw/*42.76*/("""" class="button-xs btn-danger">
                        <span class="glyphicon glyphicon-trash"></span>
                    </a>
                </td>
        </tr>
        
        """)))}),format.raw/*48.10*/("""

        """),format.raw/*50.9*/("""<p>
            <a href=""""),_display_(/*51.23*/routes/*51.29*/.HomeController.addEmployee()),format.raw/*51.58*/("""">
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
        
        """),_display_(/*72.10*/for(i<-plist) yield /*72.23*/ {_display_(Seq[Any](format.raw/*72.25*/(""" 
            """),format.raw/*73.13*/("""<tr>
                <td>"""),_display_(/*74.22*/i/*74.23*/.getId),format.raw/*74.29*/("""</td>
                <td>"""),_display_(/*75.22*/i/*75.23*/.getName),format.raw/*75.31*/("""</td>
                <td>"""),_display_(/*76.22*/i/*76.23*/.getStartDate),format.raw/*76.36*/("""</td>
                <td>"""),_display_(/*77.22*/i/*77.23*/.getNumMembers),format.raw/*77.37*/("""</td>
            </tr>
        """)))}),format.raw/*79.10*/("""
       
    
"""),format.raw/*82.1*/("""<!-- Button to add a new project -->
    <p>
        <a href=""""),_display_(/*84.19*/routes/*84.25*/.HomeController.addProject()),format.raw/*84.53*/("""">
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
        
        """),_display_(/*108.10*/for(i<-alist) yield /*108.23*/ {_display_(Seq[Any](format.raw/*108.25*/(""" 
            """),format.raw/*109.13*/("""<tr>
                <td>"""),_display_(/*110.22*/i/*110.23*/.getEircode),format.raw/*110.34*/("""</td>
                <td>"""),_display_(/*111.22*/i/*111.23*/.getStreet1),format.raw/*111.34*/("""</td>
                <td>"""),_display_(/*112.22*/i/*112.23*/.getTown),format.raw/*112.31*/("""</td>
                <td>"""),_display_(/*113.22*/i/*113.23*/.getCounty),format.raw/*113.33*/("""</td>
            </tr>
        """)))}),format.raw/*115.10*/("""
       
    """),format.raw/*117.5*/("""</tbody>
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
                  DATE: Wed Mar 13 22:06:25 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 168328b711c0f81f921dca0a039eb2681b6a8e95
                  MATRIX: 1042->1|1266->133|1296->155|1335->157|1368->186|1399->192|1439->224|1478->226|1513->235|1587->283|1600->288|1635->303|1670->312|1712->324|1740->325|2176->734|2205->747|2245->749|2287->763|2340->789|2350->790|2377->796|2431->823|2441->824|2470->832|2524->859|2534->860|2564->869|2618->896|2628->897|2658->906|2719->940|2768->968|2853->1026|2868->1032|2928->1071|3149->1265|3164->1271|3224->1310|3438->1493|3475->1503|3528->1529|3543->1535|3593->1564|4132->2076|4161->2089|4201->2091|4243->2105|4296->2131|4306->2132|4333->2138|4387->2165|4397->2166|4426->2174|4480->2201|4490->2202|4524->2215|4578->2242|4588->2243|4623->2257|4687->2290|4728->2304|4818->2367|4833->2373|4882->2401|5509->3000|5539->3013|5580->3015|5623->3029|5677->3055|5688->3056|5721->3067|5776->3094|5787->3095|5820->3106|5875->3133|5886->3134|5916->3142|5971->3169|5982->3170|6014->3180|6079->3213|6120->3226
                  LINES: 28->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|42->11|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|67->36|67->36|67->36|73->42|73->42|73->42|79->48|81->50|82->51|82->51|82->51|103->72|103->72|103->72|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|110->79|113->82|115->84|115->84|115->84|139->108|139->108|139->108|140->109|141->110|141->110|141->110|142->111|142->111|142->111|143->112|143->112|143->112|144->113|144->113|144->113|146->115|148->117
                  -- GENERATED --
              */
          