var mobile = /** @class */ (function () {
    function mobile() {
        this.simslot = 2;
        this.camera = 1;
        this.battery = 1;
        this.motherbord = 1;
    }
    mobile.prototype.withobile = function () {
        return this.camera;
    };
    return mobile;
}());
var deep = new mobile();
console.log(deep);
