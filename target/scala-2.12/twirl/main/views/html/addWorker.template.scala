
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

object addWorker extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Worker],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.users.Worker], user: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Worker", user)/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""
    """),format.raw/*6.5*/("""<p class = "lead"> Add a new Worker</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addWorkerSubmit(), 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),format.raw/*12.9*/("""<!-- Long id, String type, String fName, String lName, double salary -->
        """),_display_(/*13.10*/inputText(employeeForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*13.88*/("""
        """),_display_(/*14.10*/inputText(employeeForm("fName"), '_label -> "fName", 'class -> "form-control")),format.raw/*14.88*/("""
        """),_display_(/*15.10*/inputText(employeeForm("lName"), '_label -> "lName", 'class -> "form-control")),format.raw/*15.88*/("""
        """),_display_(/*16.10*/inputText(employeeForm("salary"), '_label -> "Salary", 'class -> "form-control")),format.raw/*16.90*/("""
        """),_display_(/*17.10*/inputText(employeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*17.94*/("""

        """),_display_(/*19.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*19.75*/("""
        
        """),format.raw/*21.9*/("""<label> Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">

        """),_display_(/*24.10*/inputText(employeeForm("role").copy(value=Some("worker")), '_label -> "", 'hidden -> "hidden")),format.raw/*24.104*/("""

        

        
        """),format.raw/*29.9*/("""<div class="actions">
            <input type="submit" value="Add Worker" class="btn btn-primary">
            <a href=""""),_display_(/*31.23*/routes/*31.29*/.HomeController.employees()),format.raw/*31.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*35.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.users.Worker],user:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.users.Worker],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 11:48:54 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/addWorker.scala.html
                  HASH: 2e42402497d221c7c3fa75938145680b1c4e084e
                  MATRIX: 994->1|1138->75|1182->73|1209->91|1236->93|1268->117|1307->119|1338->124|1409->170|1573->326|1612->328|1649->365|1686->375|1699->379|1730->389|1766->398|1875->480|1974->558|2011->568|2110->646|2147->656|2246->734|2283->744|2384->824|2421->834|2526->918|2564->929|2650->994|2695->1012|2830->1120|2946->1214|3002->1243|3150->1364|3165->1370|3213->1397|3361->1515
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|50->19|50->19|52->21|55->24|55->24|60->29|62->31|62->31|62->31|66->35
                  -- GENERATED --
              */
          