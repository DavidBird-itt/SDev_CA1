
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


        """),format.raw/*15.9*/("""<p></p>
        """),_display_(/*16.10*/inputDate(projectForm("startDate"), args = 'size -> 10, '_label -> "Start Date", 'class -> "form-control")),format.raw/*16.116*/("""
        """),_display_(/*17.10*/inputDate(projectForm("dueDate"), args = 'size -> 10, '_label -> "Due Date", 'class -> "form-control")),format.raw/*17.112*/("""
        """),_display_(/*18.10*/inputText(projectForm("numMembers"), '_label -> "Number Of Members", 'class -> "form-control")),format.raw/*18.104*/("""

        """),_display_(/*20.10*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*20.74*/("""
        
        """),format.raw/*22.9*/("""<div class="actions">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*24.23*/routes/*24.29*/.HomeController.databaseTest()),format.raw/*24.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*28.6*/("""
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
                  DATE: Fri Mar 15 11:11:29 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/addProject.scala.html
                  HASH: 8daebaa6d08256789de48f5f66e247cee25b8a2b
                  MATRIX: 990->1|1128->69|1172->67|1199->85|1226->87|1259->112|1298->114|1329->119|1402->167|1510->266|1550->268|1586->305|1623->315|1636->319|1667->329|1703->338|1812->420|1908->495|1946->506|1990->523|2118->629|2155->639|2279->741|2316->751|2432->845|2470->856|2555->920|2600->938|2749->1060|2764->1066|2815->1096|2963->1214
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|51->20|53->22|55->24|55->24|55->24|59->28
                  -- GENERATED --
              */
          