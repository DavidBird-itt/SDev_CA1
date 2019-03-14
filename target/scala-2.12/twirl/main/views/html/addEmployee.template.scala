
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
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""
        """),format.raw/*11.9*/("""<!-- Long id, String type, String fName, String lName, double salary -->
        """),_display_(/*12.10*/inputText(employeeForm("email"), '_label -> "Type", 'class -> "form-control")),format.raw/*12.87*/("""
        """),_display_(/*13.10*/inputText(employeeForm("type"), '_label -> "Type", 'class -> "form-control")),format.raw/*13.86*/("""
        """),_display_(/*14.10*/inputText(employeeForm("fName"), '_label -> "fName", 'class -> "form-control")),format.raw/*14.88*/("""
        """),_display_(/*15.10*/inputText(employeeForm("lName"), '_label -> "lName", 'class -> "form-control")),format.raw/*15.88*/("""
        """),_display_(/*16.10*/inputText(employeeForm("salary"), '_label -> "Salary", 'class -> "form-control")),format.raw/*16.90*/("""

        """),_display_(/*18.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.75*/("""
        
        """),format.raw/*20.9*/("""<div class="actions">
            <input type="submit" value="Add Employee" class="btn btn-primary">
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.databaseTest()),format.raw/*22.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*26.6*/("""
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
                  DATE: Thu Mar 14 18:32:49 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/addEmployee.scala.html
                  HASH: 6666b2e7a94cc294e379f79249b5a565fe5263d8
                  MATRIX: 999->1|1146->78|1190->76|1217->94|1244->96|1278->122|1317->124|1348->129|1422->178|1529->276|1569->278|1605->315|1642->325|1655->329|1686->339|1722->348|1831->430|1929->507|1966->517|2063->593|2100->603|2199->681|2236->691|2335->769|2372->779|2473->859|2511->870|2597->935|2642->953|2792->1076|2807->1082|2858->1112|3006->1230
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|49->18|51->20|53->22|53->22|53->22|57->26
                  -- GENERATED --
              */
          