/**
 * Created by Administrator on 2017/6/9 0009.
 */
app.controller('SidebarController',function ($rootScope,$http,$scope) {
    $scope.nodes=$rootScope.nodes;
});
app.controller('TopMessageController',function ($rootScope,$http,$scope) {
    $scope.messageNumber=Number();//消息数量
    $scope.message=[];
    $scope.user_id=$rootScope.user_id;
    $scope.user_role=$rootScope.user_role;
});
app.controller('UserController',function ($scope,$rootScope,$http) {

});
app.controller('RoleController',function ($scope,$rootScope,$http) {

});
app.controller('MenuController',function ($scope,$rootScope,$http) {
    const setting = {
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

    const zNodes = [
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