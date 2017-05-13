$(function(){
	var url = "/lexian/user/listcompanyr.do";
	var companyid = window.localStorage.getItem("companyid");
	if(!companyid)  companyid = window.sessionStorage.getItem("companyid");
	
	var dataJson = {
			id : companyid
	};
	
	doAjaxFunction(url ,dataJson, headData);
	
})

function headData(data){
	console.log(data)
	var data  = JSON.parse(data)[0];
	$("input[name='companyName']")[0].value = data.companyName;
	$("input[name='address']")[0].value = data.address;
	$("input[name='email']")[0].value = data.email;
	$("input[name='phone']")[0].value = data.phone;
	$("input[name='contactPerson']")[0].value = data.contactPerson;
	$("input[name='id']")[0].value = data.id;
}


function doAjaxFunction(url ,dataJson, callback){
	$.ajax({
        type: "POST",
        url: url,
        data: dataJson,
        success: function(data){
        	callback(data);
            }
         });
}
