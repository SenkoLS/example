public class Example implements HealthCheck, TypeHealthCheck {
    @Override
    public Health check() {
        return Health.OK;
    }

    @Override
    public TypeImplHealthCheck getType() {
        return TypeImplHealthCheck.TECHNICAL;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
