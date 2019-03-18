
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

object addDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Department],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departmentForm: Form[models.Department],  user: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Department", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    """),format.raw/*6.5*/("""<p class = "lead"> Add a new Department</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addManagerSubmit(), 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),format.raw/*12.9*/("""<!-- Long id, String type, String fName, String lName, double salary -->
        """),_display_(/*13.10*/inputText(departmentForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.88*/("""

        


        """),format.raw/*18.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">

        """),_display_(/*21.10*/inputText(departmentForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*21.77*/("""
        """),_display_(/*22.10*/inputText(departmentForm("role").copy(value=Some("worker")), '_label -> "", 'hidden -> "hidden")),format.raw/*22.106*/("""

        """),format.raw/*24.9*/("""<div class="actions">
            <input type="submit" value="Add Department" class="btn btn-primary">
            <a href=""""),_display_(/*26.23*/routes/*26.29*/.HomeController.employees()),format.raw/*26.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*30.6*/("""
""")))}))
      }
    }
  }

  def render(departmentForm:Form[models.Department],user:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(departmentForm,user)

  def f:((Form[models.Department],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (departmentForm,user) => apply(departmentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 18:06:41 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/addDepartment.scala.html
                  HASH: 86b0f6848c6ffbfabd3102a2770d0de8167e83d5
                  MATRIX: 996->1|1141->76|1185->74|1212->92|1239->94|1275->122|1314->124|1345->129|1420->179|1585->336|1624->338|1661->375|1698->385|1711->389|1742->399|1778->408|1887->490|1986->568|2034->589|2170->698|2258->765|2295->775|2413->871|2450->881|2602->1006|2617->1012|2665->1039|2813->1157
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|44->13|49->18|52->21|52->21|53->22|53->22|55->24|57->26|57->26|57->26|61->30
                  -- GENERATED --
              */
          