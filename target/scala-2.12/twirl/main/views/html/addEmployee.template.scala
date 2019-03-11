
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Employees],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.users.Employees], user: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Employee", user)/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),format.raw/*6.5*/("""<p class = "lead"> Add a new Employee </p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addEmployeeSubmit, 'class -> "form-horizontal", 'role -> "form")/*8.104*/ {_display_(Seq[Any](format.raw/*8.106*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSFF/*10.14*/.formField),format.raw/*10.24*/("""
        """),format.raw/*11.9*/("""<!-- Long id, String type, String fName, String lName, double salary -->
        """),_display_(/*12.10*/inputText(employeeForm("type"), '_label -> "Type", 'class -> "form-control")),format.raw/*12.86*/("""
        """),_display_(/*13.10*/inputText(employeeForm("fName"), '_label -> "fName", 'class -> "form-control")),format.raw/*13.88*/("""
        """),_display_(/*14.10*/inputText(employeeForm("lName"), '_label -> "lName", 'class -> "form-control")),format.raw/*14.88*/("""
        """),_display_(/*15.10*/inputText(employeeForm("salary"), '_label -> "Salary", 'class -> "form-control")),format.raw/*15.90*/("""

        """),_display_(/*17.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.75*/("""

        """),format.raw/*19.9*/("""<div class="actions">
            <input type="submit" value="Add Employee" class="btn btn-primary">
            <a href=""""),_display_(/*21.23*/routes/*21.29*/.HomeController.databaseTest()),format.raw/*21.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*25.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.users.Employees],user:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.users.Employees],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 11 20:54:09 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/addEmployee.scala.html
                  HASH: 0a445b641d8f626a7d15fef63414f3c3ca895605
                  MATRIX: 999->1|1146->78|1190->76|1217->94|1244->96|1278->122|1317->124|1348->129|1422->178|1529->276|1569->278|1605->315|1642->325|1655->329|1686->339|1722->348|1831->430|1928->506|1965->516|2064->594|2101->604|2200->682|2237->692|2338->772|2376->783|2462->848|2499->858|2649->981|2664->987|2715->1017|2863->1135
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|48->17|48->17|50->19|52->21|52->21|52->21|56->25
                  -- GENERATED --
              */
          