
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

object addManager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Manager],models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.users.Manager], user: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Manager", user)/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class = "lead"> Add a new Manager</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addManagerSubmit(), 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),format.raw/*12.9*/("""<!-- Long id, String type, String fName, String lName, double salary -->
        """),_display_(/*13.10*/inputText(employeeForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*13.88*/("""
        """),_display_(/*14.10*/inputText(employeeForm("fName"), '_label -> "First Name", 'class -> "form-control")),format.raw/*14.93*/("""
        """),_display_(/*15.10*/inputText(employeeForm("lName"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*15.92*/("""
        """),_display_(/*16.10*/inputText(employeeForm("salary"), '_label -> "Salary", 'class -> "form-control")),format.raw/*16.90*/("""
        """),_display_(/*17.10*/inputText(employeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*17.94*/("""


        """),format.raw/*20.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">

        """),_display_(/*23.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.75*/("""
        """),_display_(/*24.10*/inputText(employeeForm("role").copy(value=Some("manager")), '_label -> "", 'hidden -> "hidden")),format.raw/*24.105*/("""

        """),format.raw/*26.9*/("""<div class="actions">
            <input type="submit" value="Add Manager" class="btn btn-primary">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.employees()),format.raw/*28.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*32.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.users.Manager],user:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user,env)

  def f:((Form[models.users.Manager],models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user,env) => apply(employeeForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 11:57:21 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/addManager.scala.html
                  HASH: 50b1a987af48d0d2eaa532b76842468f6f6bbcfa
                  MATRIX: 1017->1|1189->103|1233->101|1260->119|1287->121|1320->146|1359->148|1390->153|1462->200|1627->357|1666->359|1703->396|1740->406|1753->410|1784->420|1820->429|1929->511|2028->589|2065->599|2169->682|2206->692|2309->774|2346->784|2447->864|2484->874|2589->958|2627->969|2763->1078|2849->1143|2886->1153|3003->1248|3040->1258|3189->1380|3204->1386|3252->1413|3400->1531
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|51->20|54->23|54->23|55->24|55->24|57->26|59->28|59->28|59->28|63->32
                  -- GENERATED --
              */
          