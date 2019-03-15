
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

object databaseTest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Project],List[models.Address],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(plist: List[models.Project], alist: List[models.Address], 
        emps: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Database", emps)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

    """),format.raw/*5.28*/("""
    """),_display_(/*6.6*/if(flash.containsKey("success"))/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
        """),format.raw/*7.9*/("""<div class="alert- alert-success">
            """),_display_(/*8.14*/flash/*8.19*/.get("success")),format.raw/*8.34*/("""
        """),format.raw/*9.9*/("""</div>
    """)))}),format.raw/*10.6*/("""

 
    """),format.raw/*13.5*/("""<table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Project Table</h2>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Start Date</th>
            <th>Due Date</th>
            <th>Number of Members</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Project data  -->
        
        """),_display_(/*29.10*/for(i<-plist) yield /*29.23*/ {_display_(Seq[Any](format.raw/*29.25*/(""" 
            """),format.raw/*30.13*/("""<tr>
                <td>"""),_display_(/*31.22*/i/*31.23*/.getId),format.raw/*31.29*/("""</td>
                <td>"""),_display_(/*32.22*/i/*32.23*/.getName),format.raw/*32.31*/("""</td>
                <td>"""),_display_(/*33.22*/i/*33.23*/.getStartDate),format.raw/*33.36*/("""</td>
                <td>"""),_display_(/*34.22*/i/*34.23*/.getDueDate),format.raw/*34.34*/("""</td>
                <td>"""),_display_(/*35.22*/i/*35.23*/.getNumMembers),format.raw/*35.37*/("""</td>
            </tr>
        
       
    
<!-- Button to add a new project -->
    <p>
        <a href=""""),_display_(/*42.19*/routes/*42.25*/.HomeController.addProject()),format.raw/*42.53*/("""">
            <button class="btn btn-primary">Add a Project</button>
        </a>
    </p>



<!-- Button to update an existing project -->
<td>
    <a href=""""),_display_(/*51.15*/routes/*51.21*/.HomeController.updateProject(i.getId)),format.raw/*51.59*/("""" class="button-xs btn-danger">
        <span class="glyphicon-pencil"></span>
    </a>
</td>


<!-- Button to delete an existing project -->
<td>
    <a href=""""),_display_(/*59.15*/routes/*59.21*/.HomeController.deleteProject(i.getId)),format.raw/*59.59*/("""" class="button-xs btn-danger">
        <span class="glyphicon glyphicon-trash"></span>
    </a>
</td>

        """)))}),format.raw/*64.10*/("""
"""),format.raw/*65.1*/("""</tbody>
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
        
        """),_display_(/*81.10*/for(i<-alist) yield /*81.23*/ {_display_(Seq[Any](format.raw/*81.25*/(""" 
            """),format.raw/*82.13*/("""<tr>
                <td>"""),_display_(/*83.22*/i/*83.23*/.getEircode),format.raw/*83.34*/("""</td>
                <td>"""),_display_(/*84.22*/i/*84.23*/.getStreet1),format.raw/*84.34*/("""</td>
                <td>"""),_display_(/*85.22*/i/*85.23*/.getTown),format.raw/*85.31*/("""</td>
                <td>"""),_display_(/*86.22*/i/*86.23*/.getCounty),format.raw/*86.33*/("""</td>
            </tr>
        """)))}),format.raw/*88.10*/("""
       
    """),format.raw/*90.5*/("""</tbody>
    """)))}))
      }
    }
  }

  def render(plist:List[models.Project],alist:List[models.Address],emps:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(plist,alist,emps)

  def f:((List[models.Project],List[models.Address],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (plist,alist,emps) => apply(plist,alist,emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 11:47:55 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 1eb41966925810776db582e1eb057167c6a42fad
                  MATRIX: 1013->1|1204->100|1234->122|1273->124|1306->153|1337->159|1377->191|1416->193|1451->202|1525->250|1538->255|1573->270|1608->279|1650->291|1685->299|2129->716|2158->729|2198->731|2240->745|2293->771|2303->772|2330->778|2384->805|2394->806|2423->814|2477->841|2487->842|2521->855|2575->882|2585->883|2617->894|2671->921|2681->922|2716->936|2852->1045|2867->1051|2916->1079|3103->1239|3118->1245|3177->1283|3365->1444|3380->1450|3439->1488|3583->1601|3611->1602|4031->1995|4060->2008|4100->2010|4142->2024|4195->2050|4205->2051|4237->2062|4291->2089|4301->2090|4333->2101|4387->2128|4397->2129|4426->2137|4480->2164|4490->2165|4521->2175|4585->2208|4625->2221
                  LINES: 28->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|44->13|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|73->42|73->42|73->42|82->51|82->51|82->51|90->59|90->59|90->59|95->64|96->65|112->81|112->81|112->81|113->82|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|119->88|121->90
                  -- GENERATED --
              */
          