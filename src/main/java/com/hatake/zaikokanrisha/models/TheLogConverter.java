package com.hatake.zaikokanrisha.models;


public class TheLogConverter {

    public static CategoryLogEntity categoryLogConverter(Category category){
        CategoryLogEntity categoryLog=new CategoryLogEntity();
        categoryLog.setCategoryId(category.getCategoryId());
        categoryLog.setCategoryName(category.getCategoryName());
        categoryLog.setCreatedUser(category.getCreatedUser());
        categoryLog.setLastModifiedUser(category.getLastModifiedUser());
        categoryLog.setVersion(category.getVersion());
        return categoryLog;
    }

    public static PricingLogEntity pricingLogLogConverter(Pricing pricing){
        PricingLogEntity pricingLog=new  PricingLogEntity();
        pricingLog.setPricingId(pricing.getPricingId());
        pricingLog.setCreatedUser(pricing.getCreatedUser());
        pricingLog.setLastModifiedUser(pricing.getLastModifiedUser());
        pricingLog.setPricingDiscountPrecentage(pricing.getPricingDiscountPrecentage());
        pricingLog.setPricingEffectiveDate(pricing.getPricingEffectiveDate());
        pricingLog.setPricingExpireDate(pricing.getPricingExpireDate());
        pricingLog.setPricingName(pricing.getPricingName());
        pricingLog.setVersion(pricing.getVersion());
        return pricingLog;
    }

    public static ProductLogEntity productLogConverter(Product product){
        ProductLogEntity productLog=new ProductLogEntity();
        productLog.setProductId(product.getProductId());
        productLog.setCategoryId(product.getProductId());
        productLog.setCreatedUser(product.getCreatedUser());
        productLog.setLastModifiedUser(product.getLastModifiedUser());
        productLog.setProductIsService(product.getProductIsService());
        productLog.setProductName(product.getProductName());
        productLog.setProductbuyingPrice(product.getProductbuyingPrice());
        productLog.setProductsellingPrice(product.getProductsellingPrice());
        productLog.setVersion(product.getVersion());
        return productLog;
    }

    public static StockLogEntity stockLogConverter(Stock stock){
        StockLogEntity stockLog=new StockLogEntity();
        stockLog.setRefId(stock.getRefId());
        stockLog.setCategoryId(stock.getCategory().getCategoryId());
        stockLog.setCreatedUser(stock.getCreatedUser());
        stockLog.setDateStock(stock.getDateStock());
        stockLog.setLastModifiedUser(stock.getLastModifiedUser());
        stockLog.setProductId(stock.getProduct().getProductId());
        stockLog.setQuantity(stock.getQuantity());
        stockLog.setSupplierId(stock.getSupplier().getSupplierId());
        stockLog.setVersion(stock.getVersion());
        return stockLog;
    }

    public static SupplierLogEntity supplierLogConverter(Supplier supplier){
        SupplierLogEntity supplierLog=new SupplierLogEntity();
        supplierLog.setSupplierId(supplier.getSupplierId());
        supplierLog.setCreatedUser(supplier.getCreatedUser());
        supplierLog.setLastModifiedUser(supplier.getLastModifiedUser());
        supplierLog.setSupplierCompany(supplier.getSupplierCompany());
        supplierLog.setSupplierContact(supplier.getSupplierContact());
        supplierLog.setSupplierName(supplier.getSupplierName());
        supplierLog.setVersion(supplier.getVersion());
        return supplierLog;
    }

}
