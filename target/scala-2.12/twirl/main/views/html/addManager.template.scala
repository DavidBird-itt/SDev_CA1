
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

object addManager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.users.Manager],Form[models.Address],models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.users.Manager], aForm: Form[models.Address],user: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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

        """),_display_(/*19.10*/inputText(aForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*19.86*/("""
        """),_display_(/*20.10*/inputText(aForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*20.86*/("""
        """),_display_(/*21.10*/inputText(aForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*21.79*/("""
        """),_display_(/*22.10*/inputText(aForm("county"), '_label -> "County", 'class -> "form-control")),format.raw/*22.83*/("""
        """),_display_(/*23.10*/inputText(aForm("eircode"), '_label -> "Eircode",'class -> "form-control")),format.raw/*23.84*/("""

        """),format.raw/*25.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">

        """),_display_(/*28.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*28.75*/("""
        """),_display_(/*29.10*/inputText(employeeForm("role").copy(value=Some("manager")), '_label -> "", 'hidden -> "hidden")),format.raw/*29.105*/("""

        """),format.raw/*31.9*/("""<div class="actions">
            <input type="submit" value="Add Manager" class="btn btn-primary">
            <a href=""""),_display_(/*33.23*/routes/*33.29*/.HomeController.employees()),format.raw/*33.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*37.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.users.Manager],aForm:Form[models.Address],user:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,aForm,user,env)

  def f:((Form[models.users.Manager],Form[models.Address],models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,aForm,user,env) => apply(employeeForm,aForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 17:32:31 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/addManager.scala.html
                  HASH: a6edd2cfd7c6f31371a61e203ac012da8828364e
                  MATRIX: 1038->1|1238->131|1282->129|1309->147|1336->149|1369->174|1408->176|1439->181|1511->228|1676->385|1715->387|1752->424|1789->434|1802->438|1833->448|1869->457|1978->539|2077->617|2114->627|2218->710|2255->720|2358->802|2395->812|2496->892|2533->902|2638->986|2676->997|2773->1073|2810->1083|2907->1159|2944->1169|3034->1238|3071->1248|3165->1321|3202->1331|3297->1405|3334->1415|3470->1524|3556->1589|3593->1599|3710->1694|3747->1704|3896->1826|3911->1832|3959->1859|4107->1977
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|56->25|59->28|59->28|60->29|60->29|62->31|64->33|64->33|64->33|68->37
                  -- GENERATED --
              */
          