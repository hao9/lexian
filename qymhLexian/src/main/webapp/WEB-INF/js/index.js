
var  type  = "" ; //定義是用戶查詢還是公司查詢
var url ='',datajson = {}; 
var fun = "";
 //集合
$(function () {
	//var str = window.location.href;
	var trs =window.localStorage.getItem('type');
	if("1" == trs){
		type = "user";
		dataJson = {
				username:$("#name").val()
		};
		url = "/lexian/user/listuser.do";
		$("#adduser").text("新增用户");
	}else{
		type = "company";
		dataJson = {
				companyName:$("#name").val()
		};
		url = "/lexian/user/listcompanyr.do";
		$("#adduser").text("新增信息");
	}
	 //d调转到新增页面
	$('#adduser').click(function(){
		if("1" == trs){
			window.location.href="../../html/manage/adduser.html";
		}else{
			window.location.href="../../html/manage/jbxx.html";
		}
		}); 
	//查找
	$('#queryuser').click(function(){
		if("1" == trs){
			dataJson = {
					username:$("#name").val()
			};
			doAjaxFunction(url,dataJson,headUser);
		}else{
			dataJson = {
					companyName:$("#name").val()
			};
			doAjaxFunction(url,dataJson,headCompany);
		}
 	});
	if("1" == trs){
		doAjaxFunction(url,dataJson,headUser);
	}else{
		doAjaxFunction(url,dataJson,headCompany);
	}
	//fenye
	$(".tcdPageCode").createPage({
	    pageCount:10,
	    current:1,
	    backFn:function(p){
	        console.log("dianjile"+p);
	    	//getPageData(p);
	    }
	});
	
}); 

function getPageData(page){
	var trs = window.localStorage.getItem('type');
	if("1" == trs){
		type = "user";
		dataJson = {
				curr:page,
				username:$("#name").val()
		};
		url = "/lexian/user/listuser.do";
		$("#adduser").text("新增用户");
	}else{
		type = "company";
		dataJson = {
				curr:page,
				companyName:$("#name").val()
		};
		url = "/lexian/user/listcompanyr.do";
		$("#adduser").text("新增信息");
	}
	doAjaxFunction(url,dataJson,headUser);
}
	

 function headCompany(list){
	var list  = eval(list);
    var str = ''; 
    str+="<thead><tr><th>序列号</th>";
    str+="<th>公司名称</th><th>地址</th><th>email</th><th>电话</th><th>联系人</th>";
    str+="</tr></thead>";
    str+="<tbody>";
    $.each(list, function(i, item){
    	str+="<tr>";
    	str+="<td>";
    	str+=i+1;
    	str+="</td>";
    	str+="<td>";
    	str+=item.companyName;
    	str+="</td>";
    	str+="<td>";
    	str+=item.address;
    	str+="</td>";
    	str+="<td>";
    	str+=item.email;
    	str+="</td>";
    	str+="<td>";
    	str+=item.phone;
    	str+="</td>";
    	str+="<td>";
    	str+=item.contactPerson;
    	str+="</td>";
    	str+="<td>";
    	str+="<a onClick=edithtml('"+item.id+"')>编辑</a><a onClick=Delectuser('"+item.id+"')>删除</a>";
    	str+="</td>";
    	str+="</tr>";
    });
    str+="</tbody>";
    $("#tableval").html(str);
} 

function headUser(list){
	var list  = eval(list);
    var str = ''; 
    str+="<thead><tr><th>序列号</th>";
    str+="<th>名称</th><th>职位类别</th><th>招聘人数 </th><th>工作地点</th><th>发布时间</th>";
    str+="</tr></thead>";
    str+="<tbody>";
    $.each(list, function(i, item){
    	str+="<tr>";
    	str+="<td>";
    	str+=i+1;
    	str+="</td>";
    	str+="<td>";
    	str+=item.name;
    	str+="</td>";
    	str+="<td>";
    	str+=item.lei;
    	str+="</td>";
    	str+="<td>";
    	str+=item.reshu;
    	str+="</td>";
    	str+="<td>";
    	str+=item.didaio;
    	str+="</td>";
    	str+="<td>";
    	str+=item.shijiao;
    	str+="</td>";
    	str+="<td>";
    	str+="<a onClick=edithtml('"+item.id+"')>编辑</a><a onClick=Delectuser('"+item.id+"')>删除</a>";
    	str+="</td>";
    	str+="</tr>";
    });
    str+="</tbody>";
    $("#tableval").html(str);
	
}

function  doAjaxFunction(url ,dataJson, callback){
	$.ajax({
        type: "POST",
        url: url,
        data: dataJson,
        success: function(data){
        	callback(data);
            }
         });
}


function edithtml(userid){
	if("user" == type){
		window.sessionStorage.setItem("userid",userid);
		window.location.href="/lexian/html/manage/adduser.html";
	}else{
		window.sessionStorage.setItem("companyid",userid);
		window.location.href="/lexian/html/manage/jbxx.html";
	}
	
}
function Delectuser(itemid){
	$.ajax({
		type: "GET",
        url: "/lexian/user/delect.do",
        data: {"id":itemid},
        success: function(data){
        		if("user" == type){
	        		doAjaxFunction(url,dataJson,headUser);
	        	}else{
	        		doAjaxFunction(url,dataJson,headCompany);
	        	}
			}
        })
}