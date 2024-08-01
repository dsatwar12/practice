var Human = /** @class */ (function () {
    function Human() {
        this.nose = 1;
        this.ears = 2;
        this.eyes = 2;
        this.manum = true;
    }
    Human.prototype.witheyes = function () {
        return this.eyes;
    };
    return Human;
}());
var deep = new Human();
console.log(deep);
