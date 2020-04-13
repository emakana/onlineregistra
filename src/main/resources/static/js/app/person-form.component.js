"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
var core_1 = require("@angular/core");
var person_1 = require("../person");
var PersonFormComponent = /** @class */ (function () {
    function PersonFormComponent(route, router, personService) {
        this.route = route;
        this.router = router;
        this.personService = personService;
        this.user = new person_1.Person();
    }
    PersonFormComponent.prototype.onSubmit = function () {
        var _this = this;
        this.personService.save(this.user).subscribe(function (result) { return _this.gotoUserList(); });
    };
    PersonFormComponent.prototype.gotoUserList = function () {
        this.router.navigate(['/users']);
    };
    PersonFormComponent = __decorate([
        core_1.Component({
            selector: 'app-person-form',
            templateUrl: './person-form.component.html',
            styleUrls: ['./person-form.component.css']
        })
    ], PersonFormComponent);
    return PersonFormComponent;
}());
exports.PersonFormComponent = PersonFormComponent;
