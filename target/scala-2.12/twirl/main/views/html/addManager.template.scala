
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

object addManager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[models.users.Manager],Form[models.Address],Form[models.Department],models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.users.Manager], aForm: Form[models.Address], dForm: Form[models.Department], user: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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

        """),_display_(/*19.10*/inputText(dForm("name"), '_label -> "Department Name", 'class -> "form-control")),format.raw/*19.90*/("""
        
        """),_display_(/*21.10*/inputText(aForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*21.86*/("""
        """),_display_(/*22.10*/inputText(aForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*22.86*/("""
        """),_display_(/*23.10*/inputText(aForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*23.79*/("""
        """),_display_(/*24.10*/inputText(aForm("county"), '_label -> "County", 'class -> "form-control")),format.raw/*24.83*/("""
        """),_display_(/*25.10*/inputText(aForm("eircode"), '_label -> "Eircode",'class -> "form-control")),format.raw/*25.84*/("""

        """),format.raw/*27.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">

        """),_display_(/*30.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*30.75*/("""
        """),_display_(/*31.10*/inputText(employeeForm("role").copy(value=Some("manager")), '_label -> "", 'hidden -> "hidden")),format.raw/*31.105*/("""

        """),format.raw/*33.9*/("""<div class="actions">
            <input type="submit" value="Add Manager" class="btn btn-primary">
            <a href=""""),_display_(/*35.23*/routes/*35.29*/.HomeController.employees()),format.raw/*35.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*39.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.users.Manager],aForm:Form[models.Address],dForm:Form[models.Department],user:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,aForm,dForm,user,env)

  def f:((Form[models.users.Manager],Form[models.Address],Form[models.Department],models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,aForm,dForm,user,env) => apply(employeeForm,aForm,dForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 19:55:46 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/addManager.scala.html
                  HASH: 8d6683edf25e047fc9091b8d81e483b95b533c04
                  MATRIX: 1062->1|1295->164|1339->162|1366->180|1393->182|1426->207|1465->209|1496->214|1568->261|1733->418|1772->420|1809->457|1846->467|1859->471|1890->481|1926->490|2035->572|2134->650|2171->660|2275->743|2312->753|2415->835|2452->845|2553->925|2590->935|2695->1019|2733->1030|2834->1110|2880->1129|2977->1205|3014->1215|3111->1291|3148->1301|3238->1370|3275->1380|3369->1453|3406->1463|3501->1537|3538->1547|3674->1656|3760->1721|3797->1731|3914->1826|3951->1836|4100->1958|4115->1964|4163->1991|4311->2109
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|50->19|50->19|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|58->27|61->30|61->30|62->31|62->31|64->33|66->35|66->35|66->35|70->39
                  -- GENERATED --
              */
          