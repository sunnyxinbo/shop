/**
 * Created by Administrator on 2017/6/9 0009.
 */
app.controller('SidebarController',function ($rootScope, $http, $scope) {
    //获取用户的id和权限
    let user_id = Number(document.getElementById("user_id").value);
    let user_role = Number(document.getElementById("user_role").value);
    //存入$rootScope
    $rootScope.user_id=user_id;
    $rootScope.user_role=user_role;
    let nodes = [];
    $http.post('functions',$.param({userId:user_id}),{headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
        .success(function (data){
            angular.forEach(data,function (f,index) {
                let node = {};
                node.id=f.id;
                node.name=f.name;
                node.icon=f.icon;
                node.url=f.urls;
                node.child=String();
                node.child=f.child;
                let child = Number(f.child);
                //有子节点将url改为#
                if (child==1){
                    node.url="#";
                    node.sons=f.sons;
                }else{
                }
                nodes.push(node);
            });
            $rootScope.nodes=nodes;
            $scope.nodes=nodes;
        }).error(function () {
        // alert("服务端错误");
    });
    $http.post('storeNumber',$.param({user_id:user_id}),
        {headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
        .success(function (data){
            $rootScope.storeNumber=String(data);
            //获取店铺id
            $http.post('storeId',$.param({storeNumber:$rootScope.storeNumber}),{headers:{'Content-Type':'application/x-www-form-urlencoded;charset=utf-8'}})
                .success(function (data) {
                    $rootScope.storeId=data;
                }).error(function () {

            });
        }).error(function () {
        // alert("服务端错误");
    });
});
app.controller('TopMessageController',function ($rootScope,$http,$scope) {
    $scope.messageNumber=Number();//消息数量
    $scope.message=[];
    $scope.user_id=$rootScope.user_id;
    $scope.user_role=$rootScope.user_role;
});
app.controller('UserController',function ($scope,$rootScope,$http) {
    let user_id = $rootScope.user_id;
    $http.post('AllUsers',$.param({user_id:user_id}),
        {headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
        .success(function (data){
            angular.forEach(data,function (f,index) {
                if(f.enabled==0){
                    f.enabled=String("启用");
                }else {
                    f.enabled=String("未启用");
                }
                f.check=false;//初始化所有用户没有被选定
            });
            $scope.users=data;
            $rootScope.users=$scope.users;
        }).error(function () {
        alert("服务端错误");
    });
    //当选则不同类别时，显示的数据不同
    $scope.changeData=function (style) {
        let parameter=Number(style);
        //获取启用的数据
        if (parameter==0){
            $http.post('EnabledUsers',$.param({user_id:user_id}),
                {headers:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
                .success(function (data) {
                    angular.forEach(data,function (f,index) {
                        f.enabled=String("启用");
                    });
                    $scope.users=data;
                }).error(function () {
                alert("服务端错误");
            });
        }else{
            $http.post('DisabledUsers',$.param({user_id:user_id}),
                {headers:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
                .success(function (data) {
                    angular.forEach(data,function (f,index) {
                        f.enabled=String("未启用");
                    });
                    $scope.users=data;
                }).error(function () {
                alert("服务端错误");
            });
        }
    };
    //批量操作
    $scope.checkAll=false;
    $scope.checkBoxAllChanged=function () {
        angular.forEach($scope.users,function (f,index) {
            f.check=checkAll;
        })
    };
    $scope.checkBoxChanged=function () {
        $scope.checkAll=false;
    };
    //批量删除
    $scope.deleteManyUser=function () {
        let deleteUsers=[];

        angular.forEach($scope.users,function (f,index) {
            if (f.check){
                deleteUsers.push(f.id);
            }
        });
        if (deleteUsers.length==0){
            alert("至少选择一项删除");
        }else {
            $http.post('deleteManyUser',$.param({deleteUsers:deleteUsers}),
                {headers:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
                .success(function (data) {
                    if (data == "success") {
                        for (let i = 0; i < deletUsers.length; i++) {
                            for (let y=0;y<$scope.users.length;y++){
                                if ($scope.users[y].id==deletUsers[i]){
                                    $scope.users.splice(y,1);
                                    break;
                                }
                            }
                        }
                    } else {
                        alert("删除用户失败");
                    }
                }).error(function () {
                alert("服务端错误");
            });
        }
    };
    //删除单个user
    $scope.deleteSingleUser=function (paramId) {
      let id=Number(paramId);
        $http.post('deleteSingleUser',$.param({user_id:id}),
            {headers:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
            .success(function (data) {
                if (data == "success") {
                    for (let i = 0; i < $scope.users.length; i++) {
                        if ($scope.users[i].id == id) {
                            $scope.users.splice(i, 1);
                            break;
                        }
                    }
                } else {
                    alert("删除用户失败");
                }
            }).error(function () {
            alert("服务端错误");
        });
    }
});
app.controller('AddUserController',function ($scope,$rootScope,$http,$state) {
    //获取店的所有职务
    $http.post('duties',$.param({storeNumber:$rootScope.storeNumber}),
        {headers:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
        .success(function (data) {
            $scope.duties=data;
        }).error(function () {
        alert("服务端错误");
    });
    //获取店的所有岗位
    $http.post('workstations',$.param({storeId:$rootScope.storeId}),
        {headers:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
        .success(function (data) {
            $scope.duties=data;
        }).error(function () {
        alert("服务端错误");
    });
    //跳转到下一步
    $scope.save=function () {
      $("#tabs").tabs('open',1);
    };
    $scope.user={};
    $scope.userInformation={};
    $scope.showStore=false;
    $scope.cancel=function () {
        $state.go("user");
    };
    //点击提交
    $scope.addUserAndInformation=function () {
        if (!$scope.showStore){
            user.store.number=$rootScope.storeNumber;
        }
        $http.post('addUserInformation',$.param($scope.userInformation),
            {headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
            .success(function (data){
                if(data!="defeat"){
                    $http.post('addUser',$.param({username:user.username,password:user.password,role:user.role.id,store:user.store.number,userInformation:
                    data}),
                        {headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
                        .success(function (data){
                            if (data=="success"){
                                alert("添加用户信息成功");
                                $state.go("user");
                            }
                        }).error(function () {
                        alert("服务端错误");
                    });
                }else{
                    alert("添加UserInformation失败");
                }
            }).error(function () {
            alert("服务端错误");
        });
    }
});
app.controller('UserDetailsController',function ($stateParams,$http,$scope,$rootScope) {
    let showStore=false;//将决定是否显示店铺的选项
    let id=Number($stateParams.id);
    let users=$rootScope.users;
    for (let i=0;i<users.length;i++){
        if(users[i].id==id){
            $scope.user=user[i];
            break;
        }
    }
    $scope.roles=[];
    $scope.roles.push(user.role);
    //获取这个店铺所有的role
    $http.post('roles',$.param({storeId:$rootScope.storeId}),
        {headesrs:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
        .success(function (data) {
            $scope.roles.concat(data);
        }).error(function () {
        alert("服务端错误");
    });
    if(showStore){
        $http.post('enabledStoresByOraganization',$.param({organization:$rootScope.organizationId}),
            {headesrs:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
            .success(function (data) {
                $scope.stores=data;
            }).error(function () {
            alert("服务端错误");
        });
    }
});
app.controller('RoleController',function ($scope,$rootScope,$http) {

});
app.controller('MenuController',function ($scope,$rootScope,$http) {
    let setting = {
        view: {
            addHoverDom: addHoverDom,
            removeHoverDom: removeHoverDom,
            selectedMulti: false
        },
        edit: {
            enable: true,
            editNameSelectAll: true,
            showRemoveBtn: showRemoveBtn,
            showRenameBtn: showRenameBtn
        },
        data: {
            simpleData: {
                enable: true
            }
        },
        callback: {
            beforeDrag: beforeDrag,
            beforeEditName: beforeEditName,
            beforeRemove: beforeRemove,
            beforeRename: beforeRename,
            onRemove: onRemove,
            onRename: onRename
        }
    };

    let zNodes = [
        {id: 1, pId: 0, name: "父节点 1", open: true},
        {id: 11, pId: 1, name: "叶子节点 1-1"},
        {id: 12, pId: 1, name: "叶子节点 1-2"},
        {id: 13, pId: 1, name: "叶子节点 1-3"},
        {id: 2, pId: 0, name: "父节点 2", open: true},
        {id: 21, pId: 2, name: "叶子节点 2-1"},
        {id: 22, pId: 2, name: "叶子节点 2-2"},
        {id: 23, pId: 2, name: "叶子节点 2-3"},
        {id: 3, pId: 0, name: "父节点 3", open: true},
        {id: 31, pId: 3, name: "叶子节点 3-1"},
        {id: 32, pId: 3, name: "叶子节点 3-2"},
        {id: 33, pId: 3, name: "叶子节点 3-3"}
    ];
    var log, className = "dark";
    function beforeDrag(treeId, treeNodes) {
        return false;
    }
    function beforeEditName(treeId, treeNode) {
        className = (className === "dark" ? "":"dark");
        showLog("[ "+getTime()+" beforeEditName ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name);
        var zTree = $.fn.zTree.getZTreeObj("treeDemo");
        zTree.selectNode(treeNode);
        setTimeout(function() {
            if (confirm("进入节点 -- " + treeNode.name + " 的编辑状态吗？")) {
                setTimeout(function() {
                    zTree.editName(treeNode);
                }, 0);
            }
        }, 0);
        return false;
    }
    function beforeRemove(treeId, treeNode) {
        className = (className === "dark" ? "":"dark");
        showLog("[ "+getTime()+" beforeRemove ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name);
        var zTree = $.fn.zTree.getZTreeObj("treeDemo");
        zTree.selectNode(treeNode);
        return confirm("确认删除 节点 -- " + treeNode.name + " 吗？");
    }
    function onRemove(e, treeId, treeNode) {
        showLog("[ "+getTime()+" onRemove ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name);
    }
    function beforeRename(treeId, treeNode, newName, isCancel) {
        className = (className === "dark" ? "":"dark");
        showLog((isCancel ? "<span style='color:red'>":"") + "[ "+getTime()+" beforeRename ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name + (isCancel ? "</span>":""));
        if (newName.length == 0) {
            setTimeout(function() {
                var zTree = $.fn.zTree.getZTreeObj("treeDemo");
                zTree.cancelEditName();
                alert("节点名称不能为空.");
            }, 0);
            return false;
        }
        return true;
    }
    function onRename(e, treeId, treeNode, isCancel) {
        showLog((isCancel ? "<span style='color:red'>":"") + "[ "+getTime()+" onRename ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name + (isCancel ? "</span>":""));
    }
    function showRemoveBtn(treeId, treeNode) {
        return !treeNode.isFirstNode;
    }
    function showRenameBtn(treeId, treeNode) {
        return !treeNode.isLastNode;
    }
    function showLog(str) {
        if (!log) log = $("#log");
        log.append("<li class='"+className+"'>"+str+"</li>");
        if(log.children("li").length > 8) {
            log.get(0).removeChild(log.children("li")[0]);
        }
    }
    function getTime() {
        var now= new Date(),
            h=now.getHours(),
            m=now.getMinutes(),
            s=now.getSeconds(),
            ms=now.getMilliseconds();
        return (h+":"+m+":"+s+ " " +ms);
    }

    var newCount = 1;
    function addHoverDom(treeId, treeNode) {
        var sObj = $("#" + treeNode.tId + "_span");
        if (treeNode.editNameFlag || $("#addBtn_"+treeNode.tId).length>0) return;
        var addStr = "<span class='button add' id='addBtn_" + treeNode.tId
            + "' title='add node' onfocus='this.blur();'></span>";
        sObj.after(addStr);
        var btn = $("#addBtn_"+treeNode.tId);
        if (btn) btn.bind("click", function(){
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            zTree.addNodes(treeNode, {id:(100 + newCount), pId:treeNode.id, name:"new node" + (newCount++)});
            return false;
        });
    }
    function removeHoverDom(treeId, treeNode) {
        $("#addBtn_"+treeNode.tId).unbind().remove();
    };
    function selectAll() {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo");
        zTree.setting.edit.editNameSelectAll =  $("#selectAll").attr("checked");
    }

    $(document).ready(function(){
        $.fn.zTree.init($("#treeDemo"), setting, zNodes);
        $("#selectAll").bind("click", selectAll);
    });
});
