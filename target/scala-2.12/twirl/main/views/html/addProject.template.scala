
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

        """),format.raw/*14.9*/("""<p><strong>Employees</strong></p>
        """),_display_(/*15.10*/for((value, name) <- users.Employees.options) yield /*15.55*/{_display_(Seq[Any](format.raw/*15.56*/("""
            """),format.raw/*16.13*/("""<input type="checkbox" name="empSelect[]" value=""""),_display_(/*16.63*/value),format.raw/*16.68*/(""""
                """),_display_(/*17.18*/if(projectForm("id").getValue.isPresent && projectForm("id").getValue.get != "")/*17.98*/ {_display_(Seq[Any](format.raw/*17.100*/("""
                    """),_display_(/*18.22*/if(users.Employees.inEmployees(value.toString, projectForm("id").getValue.get.toLong))/*18.108*/ {_display_(Seq[Any](format.raw/*18.110*/("""
                        """),format.raw/*19.25*/("""checked
                    """)))}),format.raw/*20.22*/("""
              """)))}),format.raw/*21.16*/("""
            """),format.raw/*22.13*/("""/> """),_display_(/*22.17*/name),format.raw/*22.21*/(""" """),format.raw/*22.22*/("""</br>    
        """)))}),format.raw/*23.10*/("""
        """),format.raw/*24.9*/("""<p></p>
        """),_display_(/*25.10*/inputDate(projectForm("startDate"), args = 'size -> 10, '_label -> "Start Date", 'class -> "form-control")),format.raw/*25.116*/("""
        """),_display_(/*26.10*/inputDate(projectForm("dueDate"), args = 'size -> 10, '_label -> "Due Date", 'class -> "form-control")),format.raw/*26.112*/("""
        """),_display_(/*27.10*/inputText(projectForm("numMembers"), '_label -> "Number Of Members", 'class -> "form-control")),format.raw/*27.104*/("""

        """),_display_(/*29.10*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*29.74*/("""
        
        """),format.raw/*31.9*/("""<div class="actions">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*33.23*/routes/*33.29*/.HomeController.databaseTest()),format.raw/*33.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*37.6*/("""
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
                  DATE: Thu Mar 14 20:33:42 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/addProject.scala.html
                  HASH: cbcb974f3a6090d1ddca71fe978900db87696ff6
                  MATRIX: 990->1|1128->69|1172->67|1199->85|1226->87|1259->112|1298->114|1329->119|1402->167|1510->266|1550->268|1586->305|1623->315|1636->319|1667->329|1703->338|1812->420|1908->495|1945->505|2015->548|2076->593|2115->594|2156->607|2233->657|2259->662|2305->681|2394->761|2435->763|2484->785|2580->871|2621->873|2674->898|2734->927|2781->943|2822->956|2853->960|2878->964|2907->965|2957->984|2993->993|3037->1010|3165->1116|3202->1126|3326->1228|3363->1238|3479->1332|3517->1343|3602->1407|3647->1425|3796->1547|3811->1553|3862->1583|4010->1701
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|51->20|52->21|53->22|53->22|53->22|53->22|54->23|55->24|56->25|56->25|57->26|57->26|58->27|58->27|60->29|60->29|62->31|64->33|64->33|64->33|68->37
                  -- GENERATED --
              */
          