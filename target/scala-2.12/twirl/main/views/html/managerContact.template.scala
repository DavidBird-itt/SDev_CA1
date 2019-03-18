
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

object managerContact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Manager],models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mlist: List[models.users.Manager] , emp: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Contact", emp)/*2.22*/ {_display_(Seq[Any](format.raw/*2.24*/("""

    """),format.raw/*4.28*/("""
"""),_display_(/*5.2*/if(flash.containsKey("success"))/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
"""),format.raw/*6.1*/("""<div class="alert- alert-success">
    """),_display_(/*7.6*/flash/*7.11*/.get("success")),format.raw/*7.26*/("""
"""),format.raw/*8.1*/("""</div>
""")))}),format.raw/*9.2*/("""
"""),format.raw/*10.1*/("""<table class="table table-bordered table-hover table-condensed">

    <thead>
        <!--Header-->
        <h2>Manager Contact Info</h2>
        <tr>
            <th>Image</th>
            <th>Email</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->

        """),_display_(/*26.10*/for(i<-mlist) yield /*26.23*/ {_display_(Seq[Any](format.raw/*26.25*/(""" """),format.raw/*26.26*/("""<tr>

            """),_display_(/*28.14*/if(env.resource("public/images/workerImages/" + i.getId + "thumb.jpg").isDefined)/*28.95*/ {_display_(Seq[Any](format.raw/*28.97*/("""
                """),format.raw/*29.17*/("""<td><img src="/assets/images/workerImages"""),_display_(/*29.59*/(i.getId + "thumb.jpg")),format.raw/*29.82*/(""""/></td>
            """)))}/*30.15*/else/*30.20*/{_display_(Seq[Any](format.raw/*30.21*/("""
                """),format.raw/*31.17*/("""<td><img src="/assets/images/workerImages/noImage.jpg"/></td>
            """)))}),format.raw/*32.14*/("""

            """),format.raw/*34.13*/("""<td>"""),_display_(/*34.18*/i/*34.19*/.getEmail),format.raw/*34.28*/("""</td>
            <td>"""),_display_(/*35.18*/i/*35.19*/.getfName),format.raw/*35.28*/("""</td>
            <td>"""),_display_(/*36.18*/i/*36.19*/.getlName),format.raw/*36.28*/("""</td>

    </tbody>
    """)))}),format.raw/*39.6*/("""
    
""")))}))
      }
    }
  }

  def render(mlist:List[models.users.Manager],emp:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(mlist,emp,env)

  def f:((List[models.users.Manager],models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (mlist,emp,env) => apply(mlist,emp,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 19:14:21 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/managerContact.scala.html
                  HASH: 02c69cc16a66452d08a169d852ca223561587b1c
                  MATRIX: 1021->1|1207->95|1235->115|1274->117|1307->146|1334->148|1374->180|1413->182|1440->183|1505->223|1518->228|1553->243|1580->244|1617->252|1645->253|2056->637|2085->650|2125->652|2154->653|2200->672|2290->753|2330->755|2375->772|2444->814|2488->837|2529->860|2542->865|2581->866|2626->883|2732->958|2774->972|2806->977|2816->978|2846->987|2896->1010|2906->1011|2936->1020|2986->1043|2996->1044|3026->1053|3081->1078
                  LINES: 28->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|41->10|57->26|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|63->32|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|70->39
                  -- GENERATED --
              */
          