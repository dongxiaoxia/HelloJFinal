var user = {
    URL: {
        deleteUrl: function (userId) {
            return "/user/" + userId;
        },
        updateUrl: function (userId) {
            return "/user/" + userId;
        }

    },
    update: function (userId) {
        var addFormData = $("form").serializeArray();
        addFormData.push({name:"user.userid",value: userId});
        $.ajax({
            url: user.URL.updateUrl(userId),
            type: 'PUT',
            data: addFormData,
            success: function(result) {
                if (result && result.code == 0){
                    location.href="/user";
                }else{
                    console.log("result:"+result.message);
                }
            }
        });
    },
    delete: function (userId) {
        $.ajax({
            url: user.URL.deleteUrl(userId),
            type: 'DELETE',
            data: {},
            success: function(result) {
                if (result && result.code == 0){
                    debugger
                    $("#" + userId).remove();
                    var length = document.getElementById("user-length").innerHTML;
                    $("#user-length").html(length - 1);
                }else{
                    console.log("result:"+result);
                }
            }
        });
    },
    init: function () {
        //$(".delete-btn").click(function (event) {
        //    console.log(event);
        //})
    }
}
