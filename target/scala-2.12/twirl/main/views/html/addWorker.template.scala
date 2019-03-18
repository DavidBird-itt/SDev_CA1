
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

object addWorker extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[models.users.Worker],Form[models.Address],Form[models.Department],models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.users.Worker], aForm: Form[models.Address], dForm: Form[models.Department], user: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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
        """),_display_(/*16.10*/inputText(employeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*16.94*/("""

        """),_display_(/*18.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.75*/("""

        """),_display_(/*20.10*/inputText(aForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*20.86*/("""
        """),_display_(/*21.10*/inputText(aForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*21.86*/("""
        """),_display_(/*22.10*/inputText(aForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*22.79*/("""
        """),_display_(/*23.10*/inputText(aForm("county"), '_label -> "County", 'class -> "form-control")),format.raw/*23.83*/("""
        """),_display_(/*24.10*/inputText(aForm("eircode"), '_label -> "Eircode",'class -> "form-control")),format.raw/*24.84*/("""
        
        """),format.raw/*26.9*/("""<label> Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">

        """),_display_(/*29.10*/inputText(employeeForm("role").copy(value=Some("worker")), '_label -> "", 'hidden -> "hidden")),format.raw/*29.104*/("""
        """),_display_(/*30.10*/inputText(employeeForm("salary").copy(value=Some("32500")), '_label -> "", 'hidden -> "hidden")),format.raw/*30.105*/("""
        
        

        
        """),format.raw/*35.9*/("""<div class="actions">
            <input type="submit" value="Add Worker" class="btn btn-primary">
            <a href=""""),_display_(/*37.23*/routes/*37.29*/.HomeController.employees()),format.raw/*37.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*41.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.users.Worker],aForm:Form[models.Address],dForm:Form[models.Department],user:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,aForm,dForm,user,env)

  def f:((Form[models.users.Worker],Form[models.Address],Form[models.Department],models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,aForm,dForm,user,env) => apply(employeeForm,aForm,dForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 20:18:38 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/addWorker.scala.html
                  HASH: a978fea98fda8180603d95dc74d91fcf0b309c3d
                  MATRIX: 1060->1|1292->163|1336->161|1363->179|1390->181|1422->205|1461->207|1492->212|1563->258|1727->414|1766->416|1803->453|1840->463|1853->467|1884->477|1920->486|2029->568|2128->646|2165->656|2264->734|2301->744|2400->822|2437->832|2542->916|2580->927|2666->992|2704->1003|2801->1079|2838->1089|2935->1165|2972->1175|3062->1244|3099->1254|3193->1327|3230->1337|3325->1411|3370->1429|3505->1537|3621->1631|3658->1641|3775->1736|3839->1773|3987->1894|4002->1900|4050->1927|4198->2045
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|49->18|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|57->26|60->29|60->29|61->30|61->30|66->35|68->37|68->37|68->37|72->41
                  -- GENERATED --
              */
          