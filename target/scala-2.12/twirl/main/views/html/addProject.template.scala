
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Project],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: Form[models.Project], user: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Project", user)/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class = "lead"> Add a new Project </p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addProjectSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.105*/ {_display_(Seq[Any](format.raw/*8.107*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""
        """),format.raw/*11.9*/("""<!-- Long id, String type, String fName, String lName, double salary -->
        """),_display_(/*12.10*/inputText(projectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.85*/("""
        """),_display_(/*13.10*/inputText(projectForm("startDate"), '_label -> "Start Date", 'class -> "form-control")),format.raw/*13.96*/("""
        """),_display_(/*14.10*/inputText(projectForm("numMembers"), '_label -> "Number Of Members", 'class -> "form-control")),format.raw/*14.104*/("""

        """),_display_(/*16.10*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*16.74*/("""
        
        """),format.raw/*18.9*/("""<div class="actions">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.HomeController.databaseTest()),format.raw/*20.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*24.6*/("""
""")))}))
      }
    }
  }

  def render(projectForm:Form[models.Project],user:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,user)

  def f:((Form[models.Project],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,user) => apply(projectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 21:29:07 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/addProject.scala.html
                  HASH: a500527bc8a29b1e23527419d0387070ba7fb718
                  MATRIX: 990->1|1128->69|1172->67|1199->85|1226->87|1259->112|1298->114|1329->119|1402->167|1510->266|1550->268|1586->305|1623->315|1636->319|1667->329|1703->338|1812->420|1908->495|1945->505|2052->591|2089->601|2205->695|2243->706|2328->770|2373->788|2522->910|2537->916|2588->946|2736->1064
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|44->13|44->13|45->14|45->14|47->16|47->16|49->18|51->20|51->20|51->20|55->24
                  -- GENERATED --
              */
          