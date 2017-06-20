/**
 * Created by Administrator on 2017/6/2 0002.
 */
var app = angular.module('app',['ui.router']);
app.run(function ($http,$state,$rootScope) {
/*    var user_id;
    var user_role;
    //获取用户的id和权限
    user_id=$("#user_id").getValue();
    user_role=$("#user_role").getValue();
    //存入$rootScope
    $rootScope.user_id=user_id;
    $rootScope.user_role=user_role;
    var nodes=[];
    $http.post('/functions',$.param({user_id:user_id}),
        {headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}})
        .success(function (data){
            angular.forEach(data,function (f,index) {
                var node={};
                node.id=f.id;
                node.name=f.name;
                node.icon=f.icon;
                node.url=f.urls;
                node.child=String();
                node.child=f.child;
                var child=Number(f.child);
                //有子节点将url改为#
                if (child==1){
                    node.url="#";
                    node.sons=f.sons;
                }else{
                }
                nodes.push(node);
            });
            $rootScope.nodes=nodes;
        }).error(function () {
        alert("服务端错误");
    });*/
});
app.config(['$stateProvider', function ($stateProvider, $urlRouterProvider) {
    $stateProvider
        .state('user', {//用户管理
            controller: 'UserController',
            controllerAs: 'user',
            url: '/user',
            templateUrl: "yangtze_assets/templates/user.html"})
        .state('role', {//用户管理
            controller: 'RoleController',
            controllerAs: 'role',
            url: '/role',
            templateUrl: "yangtze_assets/templates/role.html"})
        .state('menu', {//菜单管理
            controller: 'MenuController',
            controllerAs: 'menu',
            url: '/menu',
            templateUrl: "yangtze_assets/templates/menu.html"})
}]);