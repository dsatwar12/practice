var BIKE = /** @class */ (function () {
    function BIKE() {
        this.wheel = 2;
        this.mirror = 2;
        this.gear = 5;
        this.horn = 1;
    }
    BIKE.prototype.withwheel = function () {
        return this.wheel;
    };
    return BIKE;
}());
var deep = new BIKE();
console.log(deep);
