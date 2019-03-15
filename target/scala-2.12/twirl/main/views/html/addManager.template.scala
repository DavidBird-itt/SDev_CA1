
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

object addManager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Manager],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.users.Manager], user: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Manager", user)/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class = "lead"> Add a new Manager</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addManagerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.105*/ {_display_(Seq[Any](format.raw/*8.107*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""
        """),format.raw/*11.9*/("""<!-- Long id, String type, String fName, String lName, double salary -->
        """),_display_(/*12.10*/inputText(employeeForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*12.88*/("""
        """),_display_(/*13.10*/inputText(employeeForm("fName"), '_label -> "First Name", 'class -> "form-control")),format.raw/*13.93*/("""
        """),_display_(/*14.10*/inputText(employeeForm("lName"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*14.92*/("""
        """),_display_(/*15.10*/inputText(employeeForm("salary"), '_label -> "Salary", 'class -> "form-control")),format.raw/*15.90*/("""
        """),_display_(/*16.10*/inputText(employeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*16.94*/("""

        """),_display_(/*18.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.75*/("""
        """),_display_(/*19.10*/inputText(employeeForm("role").copy(value=Some("manager")), '_label -> "", 'hidden -> "hidden")),format.raw/*19.105*/("""

        """),format.raw/*21.9*/("""<div class="actions">
            <input type="submit" value="Add Manager" class="btn btn-primary">
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.HomeController.employees()),format.raw/*23.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*27.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.users.Manager],user:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.users.Manager],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 11:11:30 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/addManager.scala.html
                  HASH: 9d9eb59a1f80d46571dc9b0b55f2f681fd66ba09
                  MATRIX: 996->1|1141->76|1185->74|1212->92|1239->94|1272->119|1311->121|1342->126|1414->173|1522->272|1562->274|1598->311|1635->321|1648->325|1679->335|1715->344|1824->426|1923->504|1960->514|2064->597|2101->607|2204->689|2241->699|2342->779|2379->789|2484->873|2522->884|2608->949|2645->959|2762->1054|2799->1064|2948->1186|2963->1192|3011->1219|3159->1337
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|49->18|50->19|50->19|52->21|54->23|54->23|54->23|58->27
                  -- GENERATED --
              */
          