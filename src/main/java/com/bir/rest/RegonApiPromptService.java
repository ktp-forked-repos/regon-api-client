package com.bir.rest;

import com.bir.client.RegonApiWebClientActions;
import com.bir.client.ReportType;
import com.bir.model.CompanyModelConverter;
import com.bir.model.CompanyPrompt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegonApiPromptService {
    private final RegonApiWebClientActions regenApiClient;
    private final CompanyModelConverter modelConverter;

    public CompanyPrompt findCompanyByNip(String nip) throws Exception {
        String sessionId = regenApiClient.login();

        String xmlPrompt = regenApiClient.search(nip, sessionId);
        CompanyPrompt companyPrompt = modelConverter.convert(xmlPrompt, nip);

        regenApiClient.logout(sessionId);
        return companyPrompt;
    }

    public String getCompanyReport(String regon, ReportType reportType) throws Exception {
        String sessionId = regenApiClient.login();

        String report = regenApiClient.getReport(regon, reportType, sessionId);

        regenApiClient.logout(sessionId);
        return report;
    }
}
