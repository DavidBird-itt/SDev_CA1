
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
       

        """),format.raw/*31.9*/("""<p>
            <a href=""""),_display_(/*32.23*/routes/*32.29*/.HomeController.addEmployee()),format.raw/*32.58*/("""">
                <button class="btn btn-primary">Add an Employee</button>
            </a>
        </p>

    </tbody>
 
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
        <!-- Loop for creating table rows from Project data  -->
        
        """),_display_(/*54.10*/for(i<-plist) yield /*54.23*/ {_display_(Seq[Any](format.raw/*54.25*/(""" 
            """),format.raw/*55.13*/("""<tr>
                <td>"""),_display_(/*56.22*/i/*56.23*/.getId),format.raw/*56.29*/("""</td>
                <td>"""),_display_(/*57.22*/i/*57.23*/.getName),format.raw/*57.31*/("""</td>
                <td>"""),_display_(/*58.22*/i/*58.23*/.getStartDate),format.raw/*58.36*/("""</td>
                <td>"""),_display_(/*59.22*/i/*59.23*/.getNumMembers),format.raw/*59.37*/("""</td>
            </tr>
        """)))}),format.raw/*61.10*/("""
       
    
"""),format.raw/*64.1*/("""<!-- Button to add a new project -->
    <p>
        <a href=""""),_display_(/*66.19*/routes/*66.25*/.HomeController.addProject()),format.raw/*66.53*/("""">
            <button class="btn btn-primary">Add a Project</button>
        </a>
    </p>

<!-- Button to update an existing project -->
<!-- this was added but was giving errors even when commented -->

</tbody>
    <table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Address Table</h2>
        <tr>
            <th>Eircode</th>
            <th>Street 1</th>
            <th>Town</th>
            <th>County</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->
        
        """),_display_(/*90.10*/for(i<-alist) yield /*90.23*/ {_display_(Seq[Any](format.raw/*90.25*/(""" 
            """),format.raw/*91.13*/("""<tr>
                <td>"""),_display_(/*92.22*/i/*92.23*/.getEircode),format.raw/*92.34*/("""</td>
                <td>"""),_display_(/*93.22*/i/*93.23*/.getStreet1),format.raw/*93.34*/("""</td>
                <td>"""),_display_(/*94.22*/i/*94.23*/.getTown),format.raw/*94.31*/("""</td>
                <td>"""),_display_(/*95.22*/i/*95.23*/.getCounty),format.raw/*95.33*/("""</td>
            </tr>
        """)))}),format.raw/*97.10*/("""
       
    """),format.raw/*99.5*/("""</tbody>
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
                  DATE: Tue Mar 12 15:23:46 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 13f5a5bef8ff26e66a387282932b40fcd045f458
                  MATRIX: 1042->1|1266->133|1296->155|1335->157|1362->158|1798->567|1827->580|1867->582|1909->596|1962->622|1972->623|1999->629|2053->656|2063->657|2092->665|2146->692|2156->693|2186->702|2240->729|2250->730|2280->739|2341->773|2390->801|2454->834|2499->852|2552->878|2567->884|2617->913|3157->1426|3186->1439|3226->1441|3268->1455|3321->1481|3331->1482|3358->1488|3412->1515|3422->1516|3451->1524|3505->1551|3515->1552|3549->1565|3603->1592|3613->1593|3648->1607|3712->1640|3753->1654|3843->1717|3858->1723|3907->1751|4533->2350|4562->2363|4602->2365|4644->2379|4697->2405|4707->2406|4739->2417|4793->2444|4803->2445|4835->2456|4889->2483|4899->2484|4928->2492|4982->2519|4992->2520|5023->2530|5087->2563|5127->2576
                  LINES: 28->1|34->3|34->3|34->3|35->4|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|59->28|62->31|63->32|63->32|63->32|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|92->61|95->64|97->66|97->66|97->66|121->90|121->90|121->90|122->91|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|128->97|130->99
                  -- GENERATED --
              */
          