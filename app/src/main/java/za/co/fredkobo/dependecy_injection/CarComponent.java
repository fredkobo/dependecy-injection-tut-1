package za.co.fredkobo.dependecy_injection;

import dagger.Component;

@Component
interface CarComponent {
    Car getCar();
}
