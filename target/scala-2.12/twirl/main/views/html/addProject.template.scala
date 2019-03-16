
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
        
        """),format.raw/*14.9*/("""<p><strong>Developers</strong></p>
        """),_display_(/*15.10*/for((value, name) <- users.Worker.options) yield /*15.52*/{_display_(Seq[Any](format.raw/*15.53*/("""
            """),format.raw/*16.13*/("""<input type="checkbox" name="workerSelect[]" value=""""),_display_(/*16.66*/value),format.raw/*16.71*/(""""
                """),_display_(/*17.18*/if(projectForm("id").getValue.isPresent && projectForm("id").getValue.get != "")/*17.98*/ {_display_(Seq[Any](format.raw/*17.100*/("""
                    """),_display_(/*18.22*/if(users.Worker.inWorkers(value.toLong, projectForm("id").getValue.get.toLong))/*18.101*/ {_display_(Seq[Any](format.raw/*18.103*/("""
                        """),format.raw/*19.25*/("""checked
                    """)))}),format.raw/*20.22*/("""
              """)))}),format.raw/*21.16*/("""
            """),format.raw/*22.13*/("""/> """),_display_(/*22.17*/name),format.raw/*22.21*/(""" """),format.raw/*22.22*/("""</br>    
        """)))}),format.raw/*23.10*/("""

        """),format.raw/*25.9*/("""<p></p>
        """),_display_(/*26.10*/inputDate(projectForm("startDate"), args = 'size -> 10, '_label -> "Start Date", 'class -> "form-control")),format.raw/*26.116*/("""
        """),_display_(/*27.10*/inputDate(projectForm("dueDate"), args = 'size -> 10, '_label -> "Due Date", 'class -> "form-control")),format.raw/*27.112*/("""
        """),_display_(/*28.10*/inputText(projectForm("numMembers"), '_label -> "Number Of Members", 'class -> "form-control")),format.raw/*28.104*/("""

        """),_display_(/*30.10*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*30.74*/("""
        
        """),format.raw/*32.9*/("""<div class="actions">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*34.23*/routes/*34.29*/.HomeController.databaseTest()),format.raw/*34.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>

    """)))}),format.raw/*39.6*/("""
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
                  DATE: Sat Mar 16 11:48:54 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/addProject.scala.html
                  HASH: c05f7351e30a6733f9f25477b864defda9d984b1
                  MATRIX: 990->1|1128->69|1172->67|1199->85|1226->87|1259->112|1298->114|1329->119|1402->167|1510->266|1550->268|1586->305|1623->315|1636->319|1667->329|1703->338|1812->420|1908->495|1953->513|2024->557|2082->599|2121->600|2162->613|2242->666|2268->671|2314->690|2403->770|2444->772|2493->794|2582->873|2623->875|2676->900|2736->929|2783->945|2824->958|2855->962|2880->966|2909->967|2959->986|2996->996|3040->1013|3168->1119|3205->1129|3329->1231|3366->1241|3482->1335|3520->1346|3605->1410|3650->1428|3799->1550|3814->1556|3865->1586|4014->1705
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|51->20|52->21|53->22|53->22|53->22|53->22|54->23|56->25|57->26|57->26|58->27|58->27|59->28|59->28|61->30|61->30|63->32|65->34|65->34|65->34|70->39
                  -- GENERATED --
              */
          