const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot9701n/",
            name: "springboot9701n",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot9701n/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学生心理健康测试系统"
        } 
    }
}
export default base
