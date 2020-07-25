$(function () {
    var $province=$("#province");
    var $city=$("#city");
    $("<option>- - - - - - -</option>").attr("proId",0).appendTo($province);
    $("<option>- - - - - - -</option>").attr("cityId",0).appendTo($city);
    $.ajax({
        url:"queryAllProvince",
        type:"get",
        dataType:"json",
        success:function (data) {
            $(data).each(function () {
                $("<option></option>").attr("proId",this.id).html(this.name).appendTo($province);
            });
        }
    });
    $province.change(function () {
        $city.empty();
        $("<option>- - - - - - -</option>").attr("cityId",0).appendTo($city);
        var proId=$("#province>option:selected").attr("proId");
        if(proId==="0"){
            $city.attr("disabled",true);
            return;
        }
        $.ajax({
            url:"queryCity",
            type:"get",
            dataType:"json",
            data:{
                "proId":proId
            },
            success:function (data) {
                $city.attr("disabled",false);
                $(data).each(function () {
                    $("<option></option>").attr("cityId",this.id).html(this.name).appendTo($city);
                });
            }
        });
    });
});