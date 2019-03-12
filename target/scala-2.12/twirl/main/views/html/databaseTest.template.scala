
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

object databaseTest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employees],List[models.Project],List[models.Address],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elist: List[models.users.Employees], plist: List[models.Project], 
    alist: List[models.Address], emps: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Database", emps)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
"""),format.raw/*4.1*/("""<table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Employee Table</h2>
        <tr>
            <th>ID</th>
            <th>Type</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Salary</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->
        
        """),_display_(/*20.10*/for(i<-elist) yield /*20.23*/ {_display_(Seq[Any](format.raw/*20.25*/(""" 
            """),format.raw/*21.13*/("""<tr>
                <td>"""),_display_(/*22.22*/i/*22.23*/.getId),format.raw/*22.29*/("""</td>
                <td>"""),_display_(/*23.22*/i/*23.23*/.getType),format.raw/*23.31*/("""</td>
                <td>"""),_display_(/*24.22*/i/*24.23*/.getfName),format.raw/*24.32*/("""</td>
                <td>"""),_display_(/*25.22*/i/*25.23*/.getlName),format.raw/*25.32*/("""</td>
                <td>&euro; """),_display_(/*26.29*/("%.2f".format(i.getSalary))),format.raw/*26.57*/("""</td>
            </tr>
        """)))}),format.raw/*28.10*/("""
       

    """),format.raw/*31.5*/("""</tbody>
 
    <table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Project Table</h2>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Start Date</th>
            <th>Number of Members</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->
        
        """),_display_(/*48.10*/for(i<-plist) yield /*48.23*/ {_display_(Seq[Any](format.raw/*48.25*/(""" 
            """),format.raw/*49.13*/("""<tr>
                <td>"""),_display_(/*50.22*/i/*50.23*/.getId),format.raw/*50.29*/("""</td>
                <td>"""),_display_(/*51.22*/i/*51.23*/.getName),format.raw/*51.31*/("""</td>
                <td>"""),_display_(/*52.22*/i/*52.23*/.getStartDate),format.raw/*52.36*/("""</td>
                <td>"""),_display_(/*53.22*/i/*53.23*/.getNumMembers),format.raw/*53.37*/("""</td>
            </tr>
        """)))}),format.raw/*55.10*/("""
       
    """),format.raw/*57.5*/("""</tbody>

    <table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Project Table</h2>
        <tr>
            <th>Eircode</th>
            <th>Street 1</th>
            <th>Street 2</th>
            <th>Town</th>
            <th>County</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->
        
        """),_display_(/*75.10*/for(i<-alist) yield /*75.23*/ {_display_(Seq[Any](format.raw/*75.25*/(""" 
            """),format.raw/*76.13*/("""<tr>
                <td>"""),_display_(/*77.22*/i/*77.23*/.getEircode),format.raw/*77.34*/("""</td>
                <td>"""),_display_(/*78.22*/i/*78.23*/.getStreet1),format.raw/*78.34*/("""</td>
                <td>"""),_display_(/*79.22*/i/*79.23*/.getStreet2),format.raw/*79.34*/("""</td>
                <td>"""),_display_(/*80.22*/i/*80.23*/.getTown),format.raw/*80.31*/("""</td>
                <td>"""),_display_(/*81.22*/i/*81.23*/.getCounty),format.raw/*81.33*/("""</td>
            </tr>
        """)))}),format.raw/*83.10*/("""
       
    """),format.raw/*85.5*/("""</tbody>
    """)))}))
      }
    }
  }

  def render(elist:List[models.users.Employees],plist:List[models.Project],alist:List[models.Address],emps:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(elist,plist,alist,emps)

  def f:((List[models.users.Employees],List[models.Project],List[models.Address],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (elist,plist,alist,emps) => apply(elist,plist,alist,emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 12 09:24:02 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 182e7fe47f70061ebbcb92ded6247e6ac9008281
                  MATRIX: 1042->1|1266->133|1296->155|1335->157|1362->158|1798->567|1827->580|1867->582|1909->596|1962->622|1972->623|1999->629|2053->656|2063->657|2092->665|2146->692|2156->693|2186->702|2240->729|2250->730|2280->739|2341->773|2390->801|2454->834|2495->848|2925->1251|2954->1264|2994->1266|3036->1280|3089->1306|3099->1307|3126->1313|3180->1340|3190->1341|3219->1349|3273->1376|3283->1377|3317->1390|3371->1417|3381->1418|3416->1432|3480->1465|3520->1478|3971->1902|4000->1915|4040->1917|4082->1931|4135->1957|4145->1958|4177->1969|4231->1996|4241->1997|4273->2008|4327->2035|4337->2036|4369->2047|4423->2074|4433->2075|4462->2083|4516->2110|4526->2111|4557->2121|4621->2154|4661->2167
                  LINES: 28->1|34->3|34->3|34->3|35->4|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|59->28|62->31|79->48|79->48|79->48|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|86->55|88->57|106->75|106->75|106->75|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|114->83|116->85
                  -- GENERATED --
              */
          