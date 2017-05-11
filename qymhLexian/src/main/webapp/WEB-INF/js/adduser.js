$(function(){
	var url = "/lexian/user/listuser.do";
	var userid = window.localStorage.getItem("userid");
	var dataJson = {
			id : userid
	};
	
	doAjaxFunction(url ,dataJson, headData);
	
})

function headData(user){
	var user  = JSON.parse(user);
	$("input[name='name']").value = user.name;
	$("input[name='sortname']").value = user.sortname;
	$("input[name='recruitingNumbers']").value = user.recruitingNumbers;
	$("input[name='Location']").value = user.Location;
	$("input[name='pubdat']").value = user.pubdat;
	$("input")[0].value = user.id;
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
