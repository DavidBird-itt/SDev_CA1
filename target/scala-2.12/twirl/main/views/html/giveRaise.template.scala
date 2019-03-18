
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

object giveRaise extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Worker],Form[models.users.Worker],models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(wlist: List[models.users.Worker],employeeForm: Form[models.users.Worker], emp: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Raise", emp)/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""

    """),format.raw/*4.28*/("""
"""),_display_(/*5.2*/if(flash.containsKey("success"))/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
"""),format.raw/*6.1*/("""<div class="alert- alert-success">
    """),_display_(/*7.6*/flash/*7.11*/.get("success")),format.raw/*7.26*/("""
"""),format.raw/*8.1*/("""</div>
""")))}),format.raw/*9.2*/("""


"""),format.raw/*12.1*/("""<table class="table table-bordered table-hover table-condensed">

    <thead>
        <!--Header-->
        <h2>Worker Table</h2>
        <tr>
            <th>Image</th>
            <th>ID</th>
            <th>Role</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Salary</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->

        """),_display_(/*30.10*/for(i<-wlist) yield /*30.23*/ {_display_(Seq[Any](format.raw/*30.25*/(""" """),format.raw/*30.26*/("""<tr>

            """),_display_(/*32.14*/if(env.resource("public/images/workerImages/" + i.getId + "thumb.jpg").isDefined)/*32.95*/ {_display_(Seq[Any](format.raw/*32.97*/("""
                """),format.raw/*33.17*/("""<td><img src="/assets/images/workerImages/"""),_display_(/*33.60*/(i.getId + "thumb.jpg")),format.raw/*33.83*/(""""/></td>
            """)))}/*34.15*/else/*34.20*/{_display_(Seq[Any](format.raw/*34.21*/("""
                """),format.raw/*35.17*/("""<td><img src="/assets/images/workerImages/noImage.jpg"/></td>
            """)))}),format.raw/*36.14*/("""

            """),format.raw/*38.13*/("""<td>"""),_display_(/*38.18*/i/*38.19*/.getId),format.raw/*38.25*/("""</td>
            <td>"""),_display_(/*39.18*/i/*39.19*/.getRole),format.raw/*39.27*/("""</td>
            <td>"""),_display_(/*40.18*/i/*40.19*/.getfName),format.raw/*40.28*/("""</td>
            <td>"""),_display_(/*41.18*/i/*41.19*/.getlName),format.raw/*41.28*/("""</td>
            <td>&euro; """),_display_(/*42.25*/("%.2f".format(i.getSalary))),format.raw/*42.53*/("""</td>

            
    </tbody>
    """)))}),format.raw/*46.6*/("""
""")))}))
      }
    }
  }

  def render(wlist:List[models.users.Worker],employeeForm:Form[models.users.Worker],emp:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(wlist,employeeForm,emp,env)

  def f:((List[models.users.Worker],Form[models.users.Worker],models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (wlist,employeeForm,emp,env) => apply(wlist,employeeForm,emp,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 19:14:21 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/giveRaise.scala.html
                  HASH: 6268cf5ef6ee605370fd09ae6bbf1768756a6b38
                  MATRIX: 1041->1|1265->133|1291->151|1330->153|1363->182|1390->184|1430->216|1469->218|1496->219|1561->259|1574->264|1609->279|1636->280|1673->288|1703->291|2157->718|2186->731|2226->733|2255->734|2301->753|2391->834|2431->836|2476->853|2546->896|2590->919|2631->942|2644->947|2683->948|2728->965|2834->1040|2876->1054|2908->1059|2918->1060|2945->1066|2995->1089|3005->1090|3034->1098|3084->1121|3094->1122|3124->1131|3174->1154|3184->1155|3214->1164|3271->1194|3320->1222|3388->1260
                  LINES: 28->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|43->12|61->30|61->30|61->30|61->30|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|67->36|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|77->46
                  -- GENERATED --
              */
          